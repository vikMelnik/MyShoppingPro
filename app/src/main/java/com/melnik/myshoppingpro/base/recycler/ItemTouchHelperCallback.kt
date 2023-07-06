package com.melnik.myshoppingpro.base.recycler

import android.graphics.Canvas
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.abs

abstract class ItemTouchHelperCallback<T>(val adapter: T) :
	ItemTouchHelper.Callback() {

	override fun isLongPressDragEnabled(): Boolean {
		return true
	}

	override fun isItemViewSwipeEnabled(): Boolean {
		return true
	}

	override fun getMovementFlags(
		recyclerView: RecyclerView,
		viewHolder: RecyclerView.ViewHolder
	): Int {
		val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
		val swipeFlags = ItemTouchHelper.START or ItemTouchHelper.END
		return makeMovementFlags(
			dragFlags,
			swipeFlags
		)
	}

	abstract override fun onMove(
		recyclerView: RecyclerView,
		source: RecyclerView.ViewHolder,
		target: RecyclerView.ViewHolder
	): Boolean

	abstract override fun onSwiped(viewHolder: RecyclerView.ViewHolder, i: Int)

	override fun onSelectedChanged(viewHolder: RecyclerView.ViewHolder?, actionState: Int) {
		if (actionState != ItemTouchHelper.ACTION_STATE_IDLE) {
			val itemViewHolder = viewHolder as ItemTouchHelperViewHolder
			itemViewHolder.onItemSelected()
		}
		super.onSelectedChanged(viewHolder, actionState)
	}

	override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
		super.clearView(recyclerView, viewHolder)
		val itemViewHolder = viewHolder as ItemTouchHelperViewHolder
		itemViewHolder.onItemClear()
	}

	override fun onChildDraw(
		c: Canvas,
		recyclerView: RecyclerView,
		viewHolder: RecyclerView.ViewHolder,
		dX: Float,
		dY: Float,
		actionState: Int,
		isCurrentlyActive: Boolean
	) {
		if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
			val width = viewHolder.itemView.width.toFloat()
			val alpha = 1.0f - abs(dX) / width
			viewHolder.itemView.alpha = alpha
			viewHolder.itemView.translationX = dX
		} else {
			super.onChildDraw(
				c, recyclerView, viewHolder, dX, dY,
				actionState, isCurrentlyActive
			)
		}
	}
}