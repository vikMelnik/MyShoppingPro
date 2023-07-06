package com.melnik.myshoppingpro.ui.main.shoplist

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.melnik.myshoppingpro.base.BaseViewBindingFragment
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.ui.App
import com.melnik.myshoppingpro.ui.web.TestWebFragment
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentShopsListBinding
import com.melnik.myshoppingpro.utils.*
import org.koin.androidx.viewmodel.ext.android.viewModel

// Count for load InterstitialAd
private var count: Int = 0

@Suppress("UNCHECKED_CAST")
class ShopsListFragment : BaseViewBindingFragment<FragmentShopsListBinding>(
	FragmentShopsListBinding::inflate
) {
	interface OnItemViewClickListener {
		fun onItemViewClick(shops: Shops)
	}

	interface OnItemViewLongClickListener {
		fun onItemViewLongClick(shops: Shops): Boolean
	}

	companion object {
		fun newInstance(bundle: Bundle): ShopsListFragment {
			val fragment = ShopsListFragment()
			fragment.arguments = bundle
			return fragment
		}
	}

	private var adapter: ShopsListAdapter? = null

	//Add koin ViewModel
	private val shopListViewModel: ShopsListViewModel by viewModel()

	@SuppressLint("CutPasteId")
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val idn = requireArguments().getInt(ARG_GOODS_ID)
		val name = requireArguments().getString(ARG_GOODS)
		setMenuVisibility(true)
		name?.let { makeBar(activity as AppCompatActivity, it) }
		binding.shopListRecycler.layoutManager = LinearLayoutManager(requireContext())
		shopListViewModel.liveData.observe(viewLifecycleOwner) { renderData(it, idn) }
		shopListViewModel.loadDataNew(idn)
		createBackCallBack(parentFragmentManager, activity as AppCompatActivity, viewLifecycleOwner)
	}

	private fun renderData(appState: AppState, idn: Int) = with(binding) {
		when (appState) {
			is AppState.Error -> {
				shopListRecycler.visibility = View.GONE
				progressBar.visibility = View.GONE
				shopListRecycler.showSnackBar(
					getString(R.string.error),
					getString(R.string.reload),
					action = { shopListViewModel.loadDataNew(idn) })
			}
			is AppState.Loading -> {
				shopListRecycler.visibility = View.GONE
				progressBar.visibility = View.VISIBLE
			}
			is AppState.Success<*> -> {
				shopListRecycler.visibility = View.VISIBLE
				progressBar.visibility = View.GONE
				adapter = ShopsListAdapter(
					object : OnItemViewClickListener {
						override fun onItemViewClick(shops: Shops) {
							Log.d("@@@", "Move to ${shops.inetAddress}")
							moveToWebShops(shops)
						}
					},
					object : OnItemViewLongClickListener {
						override fun onItemViewLongClick(shops: Shops): Boolean {
							addToFavorite(shops)
							return true
						}
					}
				).apply { setShops(appState.data as MutableList<Pair<Shops, Boolean>>) }
				shopListRecycler.adapter = adapter

			}
		}
	}

	private fun addToFavorite(shops: Shops) {
		val idn = requireArguments().getInt(ARG_GOODS_ID)
		val str = resources.getString(R.string.add_to_favorite_shops)
		createAlertDialogForAddition(activity as AppCompatActivity, str)
		{ b ->
			if (b) {
				shopListViewModel.saveToFavorite(shops)
				shopListViewModel.loadDataNew(idn)
				createToast(App.instance.resources.getString(R.string.add_to_save))
			}
		}
	}

	private fun moveToWebShops(shops: Shops) {
		val idn = requireArguments().getInt(ARG_GOODS_ID)
		val name = requireArguments().getString(ARG_GOODS)
		arguments = Bundle().apply {
			putParcelable(ARG_SHOP_BUNDLE, shops)
			putInt(ARG_GOODS_ID_TWO, idn)
			putString(ARG_GOODS, name)
		}

		navigateToFragment(TestWebFragment.newInstance(requireArguments()))

	}

	override fun onResume() {
		super.onResume()
		val navBar: BottomNavigationView = (activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		navBar.menu.getItem(0).isCheckable = false
	}
}

