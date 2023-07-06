package com.melnik.myshoppingpro.domain.room

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "historyWebTwo_table")
@Parcelize
data class HistoryWebEntityTwo(
	@PrimaryKey(autoGenerate = true)
	val id: Long,
	val titleShop: String?,
	val urlPage: String?,
	val scrn: String?
): Parcelable
