package com.melnik.myshoppingpro.repository

import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.models.Goods
import com.melnik.myshoppingpro.models.Shops


interface Repository {
	suspend fun getShopsList(num: Int): MutableList<Pair<Shops, Boolean>>
	suspend fun getShopsListNew(num: Int): List<Pair<Shops, Boolean>>
	fun getWebShops(inetAddress: String): String
	suspend fun getAllWebHistoryTwo(): MutableList<HistoryWebEntityTwo>
	suspend fun getAllShopsFavorite(): MutableList<Pair<FavoriteEntity, Boolean>>
	suspend fun saveWebEntityScrn(titleShops: String?, urlPage: String?, srn: String?)
    suspend fun saveFavoriteEntity(shopFavor: Shops?)
	suspend fun deleteFavorByTitle(title: String?): MutableList<Pair<FavoriteEntity, Boolean>>
	suspend fun clearAllHistoryFromDb(): MutableList<HistoryWebEntityTwo>
	suspend fun clearAllFavoriteFromDb(): MutableList<FavoriteEntity>
	suspend fun deleteHistoryByScreen(scrn: String?): MutableList<HistoryWebEntityTwo>
	suspend fun getGoods(): ArrayList<Goods>
	suspend fun saveFavoriteEntityFromMyWish(shopFavorFromMyWish: HistoryWebEntityTwo)
}