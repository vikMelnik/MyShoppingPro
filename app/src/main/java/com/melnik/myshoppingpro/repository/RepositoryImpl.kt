package com.melnik.myshoppingpro.repository

import com.melnik.myshoppingpro.domain.room.DataBase
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.models.Goods
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.models.getListGoods
import com.melnik.myshoppingpro.models.lists.mapShops


class RepositoryImpl<T>(private val db: DataBase): Repository {
	/**
	 * метод создает список по номеру
	 */
	override suspend fun getShopsList(num: Int): MutableList<Pair<Shops, Boolean>> {
		return when {
			num < mapShops.size -> {
				mapShops.getValue(num)
			}
			else -> mapShops.getValue(0)
		}
	}
	/**
	 * метод создает список по номеру с использованием лайка
	 */
	override suspend fun getShopsListNew(num: Int): List<Pair<Shops, Boolean>> {
		val fList =  getAllShopsFavorite()
		val shopList = 	 when {
			num < mapShops.size -> {
				mapShops.getValue(num)
			}
			else -> mapShops.getValue(0)
		}
		return toChangeList(fList, shopList)
	}
	/**
	 * метод создает список с лайком
	 */
	private fun toChangeList(fList: MutableList<Pair<FavoriteEntity,Boolean>>, shopList: ArrayList<Pair<Shops, Boolean>>): List<Pair<Shops, Boolean>> {
		for ( i in 0 until fList.size){
			val ft = fList[i].first.id
			for (j in 0 until shopList.size){
				val fi = shopList[j].first.id
				if (ft == fi){
					shopList[j].first.iconFavorite = true
					shopList[j] = shopList[j]
				}
			}
		}
		return shopList
	}

	override fun getWebShops(inetAddress: String): String {
		return inetAddress
	}
	/**
	 * Get from db Favorite
	 */
	override suspend fun getAllShopsFavorite(): MutableList<Pair<FavoriteEntity,Boolean>> {
		return convertFavoriteEntityToFavoriteShopsPair(db.workWithDao().allFavoriteShops())
	}

	private fun convertFavoriteEntityToFavoriteShopsPair(allFavoriteShops: MutableList<FavoriteEntity>):MutableList<Pair<FavoriteEntity,Boolean>> {
	return 	allFavoriteShops.map {Pair( FavoriteEntity(it.id, it.titleShop,
		it.description, it.inetAddress, it.iconShop),false) }.toMutableList()
	}

	/**
	 * метод конвертирует избранное с БД в список избранных магазинов
	 */
	private fun convertFavoriteEntityToFavoriteShops(allFavoriteShops: MutableList<FavoriteEntity>): MutableList<FavoriteEntity> {
		return allFavoriteShops.map { FavoriteEntity(it.id, it.titleShop,
			it.description, it.inetAddress, it.iconShop) }.toMutableList()
	}
	/**
	 * Save to db Favorite
	 */
	override suspend fun saveFavoriteEntity(shopFavor: Shops?) {
		db.workWithDao().insertFavor(convertFavoriteToEntity(shopFavor))
	}
	/**
	 * Save to db Favorite from HistoryFragment
	 */
	override suspend fun saveFavoriteEntityFromMyWish(shopFavorFromMyWish: HistoryWebEntityTwo) {
		db.workWithDao().insertFavor(convertFavoriteToEntityFromMyWish(shopFavorFromMyWish))
	}
	/**
	 * метод конвертирует избранное в БД
	 */
	private fun convertFavoriteToEntityFromMyWish(shopFavorFromMyWish: HistoryWebEntityTwo): FavoriteEntity {
		val shopFavor: Shops = searchShop(shopFavorFromMyWish)
		return FavoriteEntity(
			shopFavor.id, shopFavor.titleShop, shopFavor.description, shopFavor.inetAddress,
			shopFavor.iconShop
		)
	}

	/**
	 * метод ищет по title название shop
	 */
	private fun searchShop(shopFavorFromMyWish: HistoryWebEntityTwo): Shops {
		var shop: Shops? = null
		var boolean = false
		for (i in mapShops){
			if (boolean){break}
			for (j in i.value){
				if (j.first.titleShop == shopFavorFromMyWish.titleShop){
					shop = j.first
					boolean = true
					break
				}
			}
		}
		return shop!!
	}


	/**
	 * метод удаляет избранное с БД по названию
	 */
	override suspend fun deleteFavorByTitle(title: String?): MutableList<Pair<FavoriteEntity,Boolean>>  {
		title?.let { db.workWithDao().deleteFavorByTitle(it) }
		return convertFavoriteEntityToFavoriteDeletePair(db.workWithDao().allFavoriteShops())
	}

	private fun convertFavoriteEntityToFavoriteDeletePair(allFavoriteShops: MutableList<FavoriteEntity>): MutableList<Pair<FavoriteEntity, Boolean>> {
		return allFavoriteShops.map{Pair(
			FavoriteEntity(it.id, it.titleShop,
			it.description, it.inetAddress, it.iconShop),false) }.toMutableList()
	}
	/**
	 * метод сохраняет в БД по скриншоту
	 */
	override suspend fun saveWebEntityScrn(titleShops: String?, urlPage: String?, srn: String?) {
		db.workWithDao().insertScrn(convertWebPageToEntityScrn(titleShops,urlPage, srn))
	}
	/**
	 * метод получает историю с БД для скриншота
	 */
	override suspend fun getAllWebHistoryTwo(): MutableList<HistoryWebEntityTwo> {
		return convertHistoryEntityToScreenWebPage(db.workWithDao().allScreenWebPages())
	}
	/**
	 * метод очищает БД от my wish
	 */
	override suspend fun clearAllHistoryFromDb(): MutableList<HistoryWebEntityTwo> {
		 db.workWithDao().deleteAllHistory(db.workWithDao().allScreenWebPages())
		return convertHistoryEntityToScreenWebPage(db.workWithDao().allScreenWebPages())
	}
	/**
	 * метод очищает БД от favotite
	 */
	override suspend fun clearAllFavoriteFromDb(): MutableList<FavoriteEntity> {
		db.workWithDao().deleteAllFavor(db.workWithDao().allFavoriteShops())
		return convertFavoriteEntityToFavoriteShops(db.workWithDao().allFavoriteShops())
	}

	override suspend fun deleteHistoryByScreen(scrn: String?): MutableList<HistoryWebEntityTwo> {
		scrn?.let { db.workWithDao().deleteHistoryByScreen(it) }
		return convertHistoryEntityToScreenWebPage(db.workWithDao().allScreenWebPages())
	}
	override suspend fun getGoods(): ArrayList<Goods> {
		return 	getListGoods()
	}

	/**
	 * метод конвертирует историю с БД в скриншот WebPage
	 */
	private fun convertHistoryEntityToScreenWebPage(allScreenWebPages: MutableList<HistoryWebEntityTwo>):MutableList<HistoryWebEntityTwo> {
		return allScreenWebPages.map { HistoryWebEntityTwo(it.id, it.titleShop, it.urlPage, it.scrn) }
			.toMutableList()
	}
	/**
	 * метод конвертирует избранное в БД
	 */
	private fun convertFavoriteToEntity(shopFavor: Shops?): FavoriteEntity {
		return FavoriteEntity(
			shopFavor?.id, shopFavor?.titleShop, shopFavor?.description, shopFavor?.inetAddress, shopFavor!!.iconShop
		)
	}

	/**
	 * метод конвертирует WebPage скриншот в БД
	 */
	private fun convertWebPageToEntityScrn(title: String?,urlPage: String?, scrn: String?): HistoryWebEntityTwo {
		return HistoryWebEntityTwo(
			0, title, urlPage,scrn
		)
	}
}