package com.melnik.myshoppingpro.domain.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.domain.room.IWorkWithDao

@Database(
	entities = [FavoriteEntity::class, HistoryWebEntityTwo::class,],
	version = 1,
	exportSchema = false
)
// Database class after the version update.
abstract class DataBase : RoomDatabase() {
	abstract fun workWithDao(): IWorkWithDao
}
