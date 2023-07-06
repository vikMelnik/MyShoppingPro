package com.melnik.myshoppingpro.ui.main.goodslist

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.base.BaseViewBindingFragment
import com.melnik.myshoppingpro.databinding.FragmentGoodsListBinding
import com.melnik.myshoppingpro.models.Goods
import com.melnik.myshoppingpro.ui.main.goodslist.adapters.GoodsListAdapter
import com.melnik.myshoppingpro.ui.main.shoplist.ShopsListFragment
import com.melnik.myshoppingpro.utils.ARG_GOODS
import com.melnik.myshoppingpro.utils.ARG_GOODS_ID
import com.melnik.myshoppingpro.utils.showSnackBar
import org.koin.androidx.viewmodel.ext.android.viewModel


class GoodsListFragmentWithoutBanner : BaseViewBindingFragment<FragmentGoodsListBinding>(
	FragmentGoodsListBinding::inflate
) {

	private var adapter: GoodsListAdapter? = null

	//Add koin ViewModel
	private val goodsListViewModel: GoodsListViewModel by viewModel()

	interface OnItemViewClickListener {
		fun onItemViewClick(goods: Goods)
	}

	companion object {
		fun newInstance() = GoodsListFragmentWithoutBanner()
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		(activity as AppCompatActivity).supportActionBar?.title =
			resources.getString(R.string.app_name)
		(activity as AppCompatActivity).supportActionBar?.subtitle = null //////?????????


		// Use this setting to improve performance if you know that changes
		// in content do not change the layout size of the RecyclerView.
		binding.startListRecycler.setHasFixedSize(true)
		binding.startListRecycler.layoutManager = LinearLayoutManager(requireContext())
		goodsListViewModel.liveData.observe(viewLifecycleOwner) { renderData(it) }
		goodsListViewModel.loadData()
	}

	@Suppress("UNCHECKED_CAST")
	private fun renderData(appState: AppState) = with(binding) {
		when (appState) {
			is AppState.Error -> {
				startListRecycler.visibility = View.GONE
				progressBar.visibility = View.GONE
				startListRecycler.showSnackBar(
					getString(R.string.error),
					getString(R.string.reload),
					action = { goodsListViewModel.loadData() })
			}
			is AppState.Loading -> {
				startListRecycler.visibility = View.GONE
				progressBar.visibility = View.VISIBLE
			}
			is AppState.Success<*> -> {
				startListRecycler.visibility = View.VISIBLE
				progressBar.visibility = View.GONE
				adapter = GoodsListAdapter(
					appState.data as ArrayList<Goods>,
					object : OnItemViewClickListener {
						override fun onItemViewClick(goods: Goods) =
							with(goods) { moveToShops(id, name) }
					}).apply { setGoods(appState.data as ArrayList<Goods>) }
				startListRecycler.adapter = adapter

			}
		}
	}

	private fun moveToShops(idn: Int, name: String) {
		arguments = Bundle().apply {
			putString(ARG_GOODS, name)
			putInt(ARG_GOODS_ID, idn)
		}
		navigateToFragment(ShopsListFragment.newInstance(requireArguments()))
	}

	override fun onResume() {
		super.onResume()
		val navBar: BottomNavigationView = (activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		navBar.menu.getItem(0).isCheckable = true
	}
}
