package com.melnik.myshoppingpro.ui.main.shoplist

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentItemShopsBinding
import com.melnik.myshoppingpro.models.Shops

class ShopsListAdapter(
	private val itemClickListener: ShopsListFragment.OnItemViewClickListener,
	private val itemLongClickListener: ShopsListFragment.OnItemViewLongClickListener
) : RecyclerView.Adapter<ShopsListAdapter.ShopsHolder>() {

	private var listData: MutableList<Pair<Shops, Boolean>> = mutableListOf()

	fun setShops(data: MutableList<Pair<Shops, Boolean>>) {
		listData = data
		notifyItemChanged(data.size / 2)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopsHolder {
		val binding =
			FragmentItemShopsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return ShopsHolder(binding.root)
	}

	override fun onBindViewHolder(holder: ShopsHolder, position: Int) {
		holder.bind(listData[position])
	}

	override fun getItemCount() = listData.size

	inner class ShopsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		@SuppressLint("ResourceAsColor")
		fun bind(shops: Pair<Shops, Boolean>) {
			val binding = FragmentItemShopsBinding.bind(itemView)
			binding.titleShop.text = shops.first.titleShop
			binding.description.text = shops.first.description
			binding.sign.setImageResource(shops.first.iconShop)
			if (shops.first.iconFavorite) {
				binding.iconFavorite.setImageResource(R.drawable.baseline_star_rate_24)
			} else {
				binding.iconFavorite.visibility = View.INVISIBLE
			}
			binding.root.setOnClickListener { itemClickListener.onItemViewClick(shops.first) }
			binding.root.setOnLongClickListener {
				itemLongClickListener.onItemViewLongClick(shops.first)
				true
			}
			binding.description.visibility =
				if (listData[layoutPosition].second) View.VISIBLE else View.GONE
			itemView.findViewById<ImageView>(R.id.sign).setOnClickListener {
				listData[layoutPosition] = listData[layoutPosition].let {
					it.first to !it.second
				}
				notifyItemChanged(layoutPosition)
			}
		}
	}
}


