package com.melnik.myshoppingpro.domain.room

import androidx.room.*

@Dao
interface IWorkWithDao {
	@Delete
	suspend fun deleteAllHistory(entity: MutableList<HistoryWebEntityTwo>)

	@Query("SELECT * FROM favoriteShops_table")
	suspend fun allFavoriteShops(): MutableList<FavoriteEntity>

	@Insert(onConflict = OnConflictStrategy.IGNORE)
	suspend fun insertFavor(entity: FavoriteEntity)

	@Delete
	suspend fun deleteAllFavor(entity: MutableList<FavoriteEntity>)

	@Query("DELETE FROM favoriteShops_table WHERE titleShop = :title")
	suspend fun deleteFavorByTitle(title: String)

	@Insert(onConflict = OnConflictStrategy.IGNORE)
	suspend fun insertScrn(entityTwo: HistoryWebEntityTwo)

	@Query("SELECT * FROM historyWebTwo_table")
	suspend fun allScreenWebPages(): MutableList<HistoryWebEntityTwo>

	@Query("DELETE FROM historyWebTwo_table WHERE scrn = :scrn")
	suspend fun deleteHistoryByScreen(scrn: String)
}