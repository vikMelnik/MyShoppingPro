package com.melnik.myshoppingpro.base.recycler

import android.view.View
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo

interface IForContextMenuHistory {
	fun getItemView(itemView: View, history: HistoryWebEntityTwo)
}