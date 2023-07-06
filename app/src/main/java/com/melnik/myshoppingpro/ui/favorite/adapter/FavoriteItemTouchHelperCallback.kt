package com.melnik.myshoppingpro.ui.favorite.adapter

import androidx.recyclerview.widget.RecyclerView
import com.melnik.myshoppingpro.base.recycler.ItemTouchHelperCallback

class FavoriteItemTouchHelperCallback(adapter: FavoriteListAdapter) :
	ItemTouchHelperCallback<FavoriteListAdapter>(adapter) {
	override fun onMove(
		recyclerView: RecyclerView,
		source: RecyclerView.ViewHolder,
		target: RecyclerView.ViewHolder
	): Boolean {
		adapter.onItemMove(source.adapterPosition, target.adapterPosition)
		return true
	}
	override fun onSwiped(viewHolder: RecyclerView.ViewHolder, i: Int) {
		adapter.onItemDismiss(viewHolder.adapterPosition)
	}
}