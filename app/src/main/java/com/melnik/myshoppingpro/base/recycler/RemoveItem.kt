package com.melnik.myshoppingpro.base.recycler

import com.melnik.myshoppingpro.domain.room.FavoriteEntity

fun interface RemoveItem {
	fun remove(listData: MutableList<Pair<FavoriteEntity, Boolean>>, position: Int)
}
