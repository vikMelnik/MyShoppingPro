package com.melnik.myshoppingpro.ui.main.goodslist.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.melnik.myshoppingpro.databinding.FragmentItemGoodsBinding
import com.melnik.myshoppingpro.models.Goods
import com.melnik.myshoppingpro.ui.main.goodslist.GoodsListFragmentWithoutBanner


class GoodsListAdapter(private var listData : ArrayList<Goods>,
                       private val itemClickListener: GoodsListFragmentWithoutBanner.OnItemViewClickListener
): RecyclerView.Adapter<GoodsListAdapter.GoodsHolder>() {

	@SuppressLint("NotifyDataSetChanged")
	fun setGoods(data: ArrayList<Goods>) {
		listData = data
		notifyItemChanged(listData.size/2)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoodsHolder {
		val binding = FragmentItemGoodsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return GoodsHolder(binding.root)
	}

	override fun onBindViewHolder(holder: GoodsHolder, position: Int) {
		holder.bind(listData[position])
	}

	override fun getItemCount() = listData.size

	inner class GoodsHolder(itemView: View): RecyclerView.ViewHolder(itemView){
		fun bind(goods: Goods){
			val binding = FragmentItemGoodsBinding.bind(itemView)
		    binding.header.text = goods.name
			binding.sign.setImageResource(goods.sign)
			binding.root.setOnClickListener{itemClickListener.onItemViewClick(goods)}
		}
	}
}