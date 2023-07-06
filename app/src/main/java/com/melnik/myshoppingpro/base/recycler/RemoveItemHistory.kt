package com.melnik.myshoppingpro.base.recycler

import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo

fun interface RemoveItemHistory {
	fun remove(listData: MutableList<HistoryWebEntityTwo>, position: Int)
}