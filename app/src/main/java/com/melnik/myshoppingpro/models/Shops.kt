package com.melnik.myshoppingpro.models


import android.os.Parcelable
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.utils.FNZ

import kotlinx.parcelize.Parcelize

@Parcelize
data class Shops(
	var id: Long = 999999,
	var titleShop: String = "Rozetka",
	val rating: Double = 5.0,
	var iconFavorite: Boolean = false,
	var description: String = "Somesing reviews",
	val inetAddress: String = FNZ,
	val iconShop: Int = R.drawable.allo
): Parcelable



