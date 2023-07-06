package com.melnik.myshoppingpro.base.recycler

import android.view.View
import com.melnik.myshoppingpro.domain.room.FavoriteEntity

interface IForContextMenuFavor {
	fun getItemView(itemView: View, shopsFavor: Pair<FavoriteEntity, Boolean>)
}