package com.melnik.myshoppingpro.ui.history.adapter

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.melnik.myshoppingpro.base.recycler.IForContextMenuHistory
import com.melnik.myshoppingpro.base.recycler.ItemTouchHelperAdapter
import com.melnik.myshoppingpro.base.recycler.ItemTouchHelperViewHolder
import com.melnik.myshoppingpro.base.recycler.RemoveItemHistory
import com.melnik.myshoppingpro.databinding.FragmentItemHistoryPhotoBinding
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.ui.history.HistoryFragment


class HistoryScreenRecyclerAdapter(
	private val itemClickListener: HistoryFragment.OnItemViewClickListener,
	private val callbackRemove: RemoveItemHistory,
	private val callbackItem: IForContextMenuHistory
) : RecyclerView.Adapter<HistoryScreenRecyclerAdapter.HistoryHolder>(), ItemTouchHelperAdapter {

	private var listHistoryData: MutableList<HistoryWebEntityTwo> = mutableListOf()

	fun setListDataRemove(data: MutableList<HistoryWebEntityTwo>, position: Int) {
		listHistoryData = data
		notifyItemRemoved(position)
	}

	@SuppressLint("NotifyDataSetChanged")
	fun setShops(data: MutableList<HistoryWebEntityTwo>) {
		listHistoryData = data
		notifyDataSetChanged()
	}

	override fun onCreateViewHolder(
		parent: ViewGroup,
		viewType: Int
	): HistoryHolder {
		val binding =
			FragmentItemHistoryPhotoBinding.inflate(
				LayoutInflater.from(parent.context),
				parent,
				false
			)
		return HistoryHolder(binding.root)
	}

	override fun onBindViewHolder(holder: HistoryHolder, position: Int) {
		holder.bind(listHistoryData[position])
	}

	override fun getItemCount() = listHistoryData.size

	inner class HistoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
		ItemTouchHelperViewHolder {
		fun bind(history: HistoryWebEntityTwo) {
			val binding = FragmentItemHistoryPhotoBinding.bind(itemView)
			binding.imageViewHistory.setBackgroundColor(Color.parseColor("#999999"))
			binding.titleShop.text = history.titleShop
			binding.imageViewHistory.setImageBitmap(changeToBitmap(history.scrn))
			binding.imageViewHistory.setOnClickListener { itemClickListener.onItemViewClick(history) }
			callbackItem.getItemView(binding.imageViewHistory, history)
		}

		override fun onItemSelected() {
			itemView.setBackgroundColor(Color.LTGRAY)
		}

		override fun onItemClear() {
			itemView.setBackgroundColor(0)
		}
	}

	private fun changeToBitmap(scr: String?): Bitmap? {
		//To Bitmap
		return try {
			val imageBytes = Base64.decode(scr, 0)
			BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)

		} catch (e: Exception) {
			e.message
			null
		}
	}

	override fun onItemMove(fromPosition: Int, toPosition: Int) {
		listHistoryData.removeAt(fromPosition).apply {
			listHistoryData.add(if (toPosition > fromPosition) toPosition - 1 else toPosition, this)
		}
		notifyItemMoved(fromPosition, toPosition)
	}

	override fun onItemDismiss(position: Int) {
		callbackRemove.remove(listHistoryData, position)
		notifyItemRemoved(position)
	}
}

