package com.melnik.myshoppingpro.models

import android.annotation.SuppressLint
import android.os.Parcelable
import android.util.Log
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.ui.App
import kotlinx.parcelize.Parcelize

@Parcelize
data class Goods(val id: Int, val name: String, val sign:Int): Parcelable

/**
 * Метод получения списка товаров
 */
fun getListGoods(): ArrayList<Goods> {
	val listGoods = arrayListOf<Goods>()
	for ((num, i) in App.instance.resources.getStringArray(R.array.goods).toList().withIndex()) {
		val j = fromImageRes(num)
		listGoods.add(Goods(num,i, j))
	}
	Log.d("@@@@","$listGoods")
	return listGoods
}

/**
 * Метод получения изображений из ресурсов
 */
@SuppressLint("DiscouragedApi")
private fun fromImageRes(i: Int): Int {
	val name = App.instance.resources.getStringArray(R.array.drgoods)[i]
	return App.instance.resources.getIdentifier(
		/* name = */ name, /* defType = */ "drawable",
		/* defPackage = */ App.instance.packageName
	)
}



