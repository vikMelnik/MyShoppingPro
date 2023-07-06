package com.melnik.myshoppingpro.ui.favorite


import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.melnik.myshoppingpro.base.BaseViewBindingFragment
import com.melnik.myshoppingpro.base.recycler.IForContextMenuFavor
import com.melnik.myshoppingpro.base.recycler.RemoveItem
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.ui.favorite.adapter.FavoriteItemTouchHelperCallback
import com.melnik.myshoppingpro.ui.favorite.adapter.FavoriteListAdapter
import com.melnik.myshoppingpro.ui.web.TestWebFragment
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentFavoriteListBinding
import com.melnik.myshoppingpro.utils.*
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("UNCHECKED_CAST", "DEPRECATION", "OVERRIDE_DEPRECATION")
class FavoriteListFragment : BaseViewBindingFragment<FragmentFavoriteListBinding>(
	FragmentFavoriteListBinding::inflate
) {
	interface OnItemViewClickListener {
		fun onItemViewClick(shopsFavor: FavoriteEntity)
	}

	private val callbackRemove =
		RemoveItem { listData, position ->
			//listData.removeAt(position)
			deleteFromFavorByTitle(listData[position].first.titleShop)
			adapter!!.setListDataRemove(listData, position)
		}

	private var shopsFavorite: Pair<FavoriteEntity, Boolean>? = null
	private val callbackItem = object : IForContextMenuFavor {
		override fun getItemView(itemView: View, shopsFavor: Pair<FavoriteEntity, Boolean>) {
			shopsFavorite = shopsFavor
			registerForContextMenu(itemView)
		}
	}

	private var adapter: FavoriteListAdapter? = null

	//Add koin ViewModel
	private val viewModel: FavoriteListViewModel by viewModel()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setHasOptionsMenu(true)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		(activity as AppCompatActivity).supportActionBar?.title =
			resources.getString(R.string.favorites)

		//hideNavIcon(activity as AppCompatActivity, 0)
		viewModel.favoriteLiveData.observe(viewLifecycleOwner) { renderData(it) }
		viewModel.getAllFavorite()
		createBackCallBack(parentFragmentManager, activity as AppCompatActivity, viewLifecycleOwner)
	}

	override fun onCreateContextMenu(
		menu: ContextMenu,
		v: View,
		menuInfo: ContextMenu.ContextMenuInfo?
	) {
		super.onCreateContextMenu(menu, v, menuInfo)
		requireActivity().menuInflater.inflate(R.menu.menu_context, menu)
		menu.findItem(R.id.share).isVisible = false
	}

	@SuppressLint("NotifyDataSetChanged")
	@RequiresApi(Build.VERSION_CODES.O)
	override fun onContextItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			R.id.delete -> {
				deleteFromFavorByTitle(shopsFavorite?.first?.titleShop)
				adapter?.notifyDataSetChanged()
			}
			else -> super.onOptionsItemSelected(item)
		}
		return true
	}


	override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
		inflater.inflate(R.menu.menu_fragment_history_and_favor, menu)
	}

	@SuppressLint("NotifyDataSetChanged")
	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			R.id.clear_all -> {
				deleteAllFavorite()
				adapter?.notifyDataSetChanged()
				return true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}

	private fun deleteAllFavorite() {
		createAlertDialogForHistoryAndFavor(activity as AppCompatActivity, 1)
		{ b -> if (b) viewModel.clearAllFavorite() }
	}

	private fun renderData(appState: AppState) = with(binding) {
		when (appState) {
			is AppState.Error -> {
				progressBar.visibility = View.GONE
				favoriteListRecycler.showSnackBar(
					getString(R.string.error),
					getString(R.string.reload),
					action = { viewModel.getAllFavorite() })
			}
			is AppState.Loading -> {
				favoriteListRecycler.visibility = View.GONE
				progressBar.visibility = View.VISIBLE
			}
			is AppState.Success<*> -> {
				favoriteListRecycler.visibility = View.VISIBLE
				progressBar.visibility = View.GONE
				adapter = FavoriteListAdapter(
					object : OnItemViewClickListener {
						override fun onItemViewClick(shopsFavor: FavoriteEntity) {
							Log.d("@@@", "Move to ${shopsFavor.inetAddress}")
							moveToWebShops(shopsFavor)
						}
					}, callbackRemove, callbackItem
				).apply { setShops(appState.data as MutableList<Pair<FavoriteEntity, Boolean>>) }
				favoriteListRecycler.adapter = adapter
				ItemTouchHelper(FavoriteItemTouchHelperCallback(adapter!!))
					.attachToRecyclerView(favoriteListRecycler)
			}
		}
	}

	private fun deleteFromFavorByTitle(titleShop: String?) {
		createAlertDialogForHistoryAndFavor(activity as AppCompatActivity, 0)
		{ b -> if (b) viewModel.deleteFromFavoriteByTitle(titleShop) }
	}

	private fun moveToWebShops(shopsFavor: FavoriteEntity) {
		arguments = Bundle().apply {
			putParcelable(ARG_SHOP_BUNDLE_FAVORITE, shopsFavor)
			putInt(ARG_NAV_BAR, 1)
		}
		navigateToFragment(TestWebFragment.newInstance(requireArguments()))
	}
	override fun onResume() {
		super.onResume()
		val navBar: BottomNavigationView = (activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		navBar.menu.getItem(1).isCheckable = true
	}
}



