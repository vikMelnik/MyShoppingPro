package com.melnik.myshoppingpro.ui.history


import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.melnik.myshoppingpro.base.BaseViewBindingFragment
import com.melnik.myshoppingpro.base.recycler.IForContextMenuHistory
import com.melnik.myshoppingpro.base.recycler.RemoveItemHistory
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.ui.history.adapter.HistoryItemTouchHelperCallback
import com.melnik.myshoppingpro.ui.history.adapter.HistoryScreenRecyclerAdapter
import com.melnik.myshoppingpro.ui.web.TestWebFragment
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentHistoryBinding
import com.melnik.myshoppingpro.utils.*
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("UNCHECKED_CAST", "DEPRECATION", "OVERRIDE_DEPRECATION")
class HistoryFragment : BaseViewBindingFragment<FragmentHistoryBinding>(
	FragmentHistoryBinding::inflate
) {

	interface OnItemViewClickListener {
		fun onItemViewClick(historyEntity: HistoryWebEntityTwo)
	}

	private val callbackRemove =
		RemoveItemHistory { listData, position ->
			deleteFromHistoryByScreenAlert(listData[position].scrn)
			adapter!!.setListDataRemove(listData, position)
		}

	private var historyEntity: HistoryWebEntityTwo? = null
	private val callbackItem = object : IForContextMenuHistory {
		override fun getItemView(itemView: View, history: HistoryWebEntityTwo) {
			registerForContextMenu(itemView)
			historyEntity = history
		}
	}

	private fun deleteFromHistoryByScreenAlert(scrn: String?) {
		createAlertDialogForHistoryAndFavor(activity as AppCompatActivity, 0)
		{ b -> if (b) viewModel.deleteFromHistoryByScreen(scrn) }
	}

	private val viewModel: HistoryViewModel by viewModel()
	private var adapter: HistoryScreenRecyclerAdapter? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setHasOptionsMenu(true)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		(activity as AppCompatActivity).supportActionBar?.title =
			resources.getString(R.string.history)
		(activity as AppCompatActivity).supportActionBar?.subtitle = null

		binding.historyFragmentRecyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
		viewModel.historyLiveData.observe(viewLifecycleOwner) { renderData(it) }
		viewModel.getAllHistoryTwo()
		createBackCallBack(parentFragmentManager, activity as AppCompatActivity, viewLifecycleOwner)

	}

	override fun onCreateContextMenu(
		menu: ContextMenu,
		v: View,
		menuInfo: ContextMenu.ContextMenuInfo?
	) {
		super.onCreateContextMenu(menu, v, menuInfo)
		requireActivity().menuInflater.inflate(R.menu.menu_context, menu)
	}

	override fun onContextItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			R.id.delete -> {
				deleteFromHistoryByScreenAlert(historyEntity?.scrn)
			}
			R.id.share -> {
				historyEntity?.urlPage?.let { it1 ->
					historyEntity!!.scrn?.let {
						createShare(it, it1, activity as AppCompatActivity)
					}
				}
			}
			else -> super.onOptionsItemSelected(item)
		}
		return true
	}

	override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
		inflater.inflate(R.menu.menu_fragment_history_and_favor, menu)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			R.id.clear_all -> {
				deleteAllHistory()
				return true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}
	private fun deleteAllHistory() {
		createAlertDialogForHistoryAndFavor(activity as AppCompatActivity, 1)
		{ b -> if (b) viewModel.clearAllHistory() }
	}

	private fun renderData(appState: AppState?) = with(binding) {
		when (appState) {
			is AppState.Success<*> -> {
				historyFragmentRecyclerView.visibility = View.VISIBLE
				progressBar.visibility = View.GONE
				adapter = HistoryScreenRecyclerAdapter(
					object : OnItemViewClickListener {
						override fun onItemViewClick(historyEntity: HistoryWebEntityTwo) {
							Log.d("@@@", "Move from adapter ${historyEntity.urlPage}")
							moveToWeb(historyEntity)
						}
					}, callbackRemove, callbackItem
				).apply { setShops(appState.data as MutableList<HistoryWebEntityTwo>) }
				historyFragmentRecyclerView.adapter = adapter
				ItemTouchHelper(HistoryItemTouchHelperCallback(adapter!!)).attachToRecyclerView(
					historyFragmentRecyclerView
				)
			}
			is AppState.Loading -> {
				historyFragmentRecyclerView.visibility = View.GONE
				progressBar.visibility = View.VISIBLE
			}
			is AppState.Error -> {
				progressBar.visibility = View.GONE
				historyFragmentRecyclerView.showSnackBar(
					getString(R.string.error),
					getString(R.string.reload),
					action = { viewModel.getAllHistoryTwo() })
			}
			else -> {}
		}
	}
	private fun moveToWeb(historyEntity: HistoryWebEntityTwo) {
		arguments = Bundle().apply {
			putParcelable(ARG_SHOP_BUNDLE_HISTORY, historyEntity)
			putInt(ARG_NAV_BAR, 2)
		}
	navigateToFragment(TestWebFragment.newInstance(requireArguments()))
	}
	override fun onResume() {
		super.onResume()
		val navBar: BottomNavigationView = (activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		navBar.menu.getItem(2).isCheckable = true
	}
}

