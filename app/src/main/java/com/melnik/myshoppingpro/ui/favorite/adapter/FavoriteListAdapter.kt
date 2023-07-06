package com.melnik.myshoppingpro.ui.favorite.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.melnik.myshoppingpro.base.recycler.IForContextMenuFavor
import com.melnik.myshoppingpro.base.recycler.ItemTouchHelperAdapter
import com.melnik.myshoppingpro.base.recycler.ItemTouchHelperViewHolder
import com.melnik.myshoppingpro.base.recycler.RemoveItem
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentFavoriteItemBinding
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.ui.favorite.FavoriteListFragment

class FavoriteListAdapter(
	private val itemClickListener: FavoriteListFragment.OnItemViewClickListener,
	private val callbackRemove: RemoveItem,
	private val callbackItemFavor: IForContextMenuFavor
) : RecyclerView.Adapter<FavoriteListAdapter.FavoriteHolder>(), ItemTouchHelperAdapter {

	private var listData: MutableList<Pair<FavoriteEntity, Boolean>> = mutableListOf()

	fun setListDataRemove(data: MutableList<Pair<FavoriteEntity, Boolean>>, position: Int) {
		listData = data
		notifyItemRemoved(position)
	}

	@SuppressLint("NotifyDataSetChanged")
	fun setShops(data: MutableList<Pair<FavoriteEntity, Boolean>>) {
		listData = data
		notifyDataSetChanged()
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteHolder {
		val binding =
			FragmentFavoriteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return FavoriteHolder(binding.root)
	}

	override fun onBindViewHolder(holder: FavoriteHolder, position: Int) {
		holder.bind(listData[position])
	}

	override fun getItemCount() = listData.size

	inner class FavoriteHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
		ItemTouchHelperViewHolder {
		fun bind(shopsFavor: Pair<FavoriteEntity, Boolean>) {
			val binding = FragmentFavoriteItemBinding.bind(itemView)
			binding.titleShop.text = shopsFavor.first.titleShop
			binding.description.text = shopsFavor.first.description
			binding.sign.setImageResource(shopsFavor.first.iconShop)
			binding.root.setOnClickListener { itemClickListener.onItemViewClick(shopsFavor.first) }
			binding.description.visibility =
				if (listData[layoutPosition].second) View.VISIBLE else View.GONE
			itemView.findViewById<ImageView>(R.id.sign).setOnClickListener {
				listData[layoutPosition] = listData[layoutPosition].let {
					it.first to !it.second
				}
				notifyItemChanged(layoutPosition)
			}
			callbackItemFavor.getItemView(itemView, shopsFavor)
		}

		override fun onItemSelected() {
			itemView.setBackgroundColor(Color.LTGRAY)
		}

		override fun onItemClear() {
			itemView.setBackgroundColor(0)
		}
	}

	override fun onItemMove(fromPosition: Int, toPosition: Int) {
		listData.removeAt(fromPosition).apply {
			listData.add(if (toPosition > fromPosition) toPosition - 1 else toPosition, this)
		}
		notifyItemMoved(fromPosition, toPosition)
	}

	override fun onItemDismiss(position: Int) {
		callbackRemove.remove(listData, position)
		//listData.removeAt(position)
		notifyItemRemoved(position)
	}
}