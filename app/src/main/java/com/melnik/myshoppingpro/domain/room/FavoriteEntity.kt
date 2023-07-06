package com.melnik.myshoppingpro.domain.room

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "favoriteShops_table")
@Parcelize
data class FavoriteEntity(
	@PrimaryKey(autoGenerate = true)
	val id: Long?,
	val titleShop: String?,
	val description: String?,
	val inetAddress: String?,
	val iconShop: Int
): Parcelable
