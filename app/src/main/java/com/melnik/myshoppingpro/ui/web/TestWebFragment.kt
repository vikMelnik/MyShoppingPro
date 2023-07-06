package com.melnik.myshoppingpro.ui.web

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.*
import android.view.animation.DecelerateInterpolator
import android.webkit.*
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.melnik.myshoppingpro.base.BaseViewBindingFragment
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.ui.App
import com.melnik.myshoppingpro.ui.main.shoplist.ShopsListFragment
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.FragmentWebSwiperefreshBinding
import com.melnik.myshoppingpro.utils.*
import org.koin.androidx.viewmodel.ext.android.viewModel


@Suppress("DEPRECATION", "OVERRIDE_DEPRECATION")
class TestWebFragment : BaseViewBindingFragment<FragmentWebSwiperefreshBinding>(
	FragmentWebSwiperefreshBinding::inflate
) {
	companion object {
		@JvmStatic
		fun newInstance(shops: Bundle): TestWebFragment {
			val fragment = TestWebFragment()
			fragment.arguments = shops
			return fragment
		}
	}

	private val webViewModel: WebViewModel by viewModel()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setHasOptionsMenu(true)
	}

	@SuppressLint("ResourceType")
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val navBar: BottomNavigationView =
			(activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		val actionBar: Toolbar = (activity as AppCompatActivity).findViewById(R.id.toolbar)

		val nameUrl = requireArguments().getParcelable<Shops>(ARG_SHOP_BUNDLE)
		val nameUrlFavor =
			requireArguments().getParcelable<FavoriteEntity>(ARG_SHOP_BUNDLE_FAVORITE)
		val nameUrHistory =
			requireArguments().getParcelable<HistoryWebEntityTwo>(ARG_SHOP_BUNDLE_HISTORY)

		if (nameUrlFavor == null && nameUrHistory == null) {
			nameUrl?.let { initWeb(it.inetAddress, navBar, actionBar) }
			nameUrl?.let { makeBar(activity as AppCompatActivity, it.titleShop) }
		} else if (nameUrl == null && nameUrHistory == null) {
			nameUrlFavor?.inetAddress?.let {initWeb(it, navBar, actionBar)
			nameUrlFavor.titleShop?.let { it1 -> makeBar(activity as AppCompatActivity, it1) }
			}
		} else {
			nameUrHistory?.urlPage?.let {initWeb(it, navBar, actionBar)
			nameUrHistory.titleShop?.let { it1 -> makeBar(activity as AppCompatActivity, it1) }
			}
		}
		webViewModel.liveData.observe(viewLifecycleOwner) {}

		registerForContextMenu(binding.webview)

	}

	override fun onCreateContextMenu(
		menu: ContextMenu,
		v: View,
		menuInfo: ContextMenu.ContextMenuInfo?
	) {
		super.onCreateContextMenu(menu, v, menuInfo)
		requireActivity().menuInflater.inflate(R.menu.menu_fragment, menu)
	}

	override fun onContextItemSelected(item: MenuItem): Boolean {
		when (item.itemId) {
			R.id.add_to_history -> {
				addToHistoryWeb()
			}

			R.id.add_to_favorite -> {
				addToFavoriteWeb()
			}
			R.id.share -> {
				shareWeb()
			}
			else -> super.onOptionsItemSelected(item)
		}

		return true
	}
	override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
		inflater.inflate(R.menu.menu_fragment, menu)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			R.id.add_to_history -> {
				addToHistoryWeb()
				true
			}

			R.id.add_to_favorite -> {
				addToFavoriteWeb()
				true
			}
			R.id.share -> {
				shareWeb()
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}

	private fun addToHistoryWeb() {
		val titleShops = requireArguments().getParcelable<Shops>(ARG_SHOP_BUNDLE)
		val titleFavor =
			requireArguments().getParcelable<FavoriteEntity>(ARG_SHOP_BUNDLE_FAVORITE)
		val nameUrHistory =
			requireArguments().getParcelable<HistoryWebEntityTwo>(ARG_SHOP_BUNDLE_HISTORY)
		if (titleFavor == null && nameUrHistory == null) {
			savePageUrl(titleShops?.titleShop)
		} else if (titleShops == null && nameUrHistory == null) {
			savePageUrl(titleFavor?.titleShop)
		} else {
			savePageUrl(nameUrHistory?.titleShop)
		}
	}

	private fun addToFavoriteWeb() {
		val shopFavorite = requireArguments().getParcelable<Shops>(ARG_SHOP_BUNDLE)
		val shopFavorFromMyWish =
			requireArguments().getParcelable<HistoryWebEntityTwo>(ARG_SHOP_BUNDLE_HISTORY)
		if (shopFavorite != null) {
			saveFavoriteShops(shopFavorite)
		} else {
			saveFavoriteShopsFromMyWish(shopFavorFromMyWish)
		}
	}

	private fun saveFavoriteShopsFromMyWish(shopFavorFromMyWish: HistoryWebEntityTwo?) {
		val str = resources.getString(R.string.add_to_favorite_shops)
		createAlertDialogForAddition(activity as AppCompatActivity, str)
		{ b ->
			if (b) {
				shopFavorFromMyWish?.let { webViewModel.addToFavoriteFromMyWish(it) }
				createToast(App.instance.resources.getString(R.string.add_to_save))
			}
		}
	}

	private fun shareWeb() {
		val screenStr = makeScreenToSave(binding.webview)
		binding.webview.url?.let { it1 ->
			createShare(screenStr, it1, activity as AppCompatActivity)
		}
	}

	private fun saveFavoriteShops(shopFavor: Shops?) {
		val str = resources.getString(R.string.add_to_favorite_shops)
		createAlertDialogForAddition(activity as AppCompatActivity, str)
		{ b ->
			if (b) {
				webViewModel.addToFavorite(shopFavor)
				createToast(App.instance.resources.getString(R.string.add_to_save))
			}
		}
	}

	private fun savePageUrl(titleShops: String?) {
		val screenStr = makeScreenToSave(binding.webview)
		webViewModel.addToHistoryScrn(titleShops, binding.webview.url, screenStr)
		createToast(App.instance.resources.getString(R.string.add_to_save))
	}

	@SuppressLint("SetJavaScriptEnabled", "ClickableViewAccessibility")
	private fun initWeb(nameUrl: String, navBar: BottomNavigationView, toolbar: Toolbar) =
		with(binding) {
			MyTestWebViewClient.createWebView(webview, progressBar)
			swipeRefreshLayout.setOnRefreshListener {
				swipeRefreshLayout.isRefreshing = true
				Handler().postDelayed({
					run {
						nameUrl.let { webview.loadUrl(it) }
						swipeRefreshLayout.isRefreshing = false
					}
				}, 2000)

				swipeRefreshLayout.setColorSchemeColors(
					resources.getColor(android.R.color.holo_blue_bright),
					resources.getColor(android.R.color.holo_orange_dark),
					resources.getColor(android.R.color.holo_green_dark),
					resources.getColor(android.R.color.holo_red_dark)
				)
			}
			nameUrl.let { webview.loadUrl(it) }

			val callback = object : OnBackPressedCallback(true) {
				override fun handleOnBackPressed() {
					with(binding) {
						if (webview.canGoBack()) {
							webview.goBack()
						} else {
							val goods = requireArguments().getString(ARG_GOODS)
							val idn = requireArguments().getInt(ARG_GOODS_ID_TWO)
							if (goods != null) {
								arguments = Bundle().apply {
									putInt(ARG_GOODS_ID, idn)
									putString(ARG_GOODS, goods)
								}
								navigateToFragment(ShopsListFragment.newInstance(requireArguments()))
							} else {
								//navigateToFragment(GoodsListFragment())
							}
						}
					}
				}
			}
			activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, callback)
		}

	override fun onDestroyView() {
		binding.webview.clearCache(true)
		val navBar: BottomNavigationView =
			(activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		navBar.animate().translationY((0f).toFloat())
			.setInterpolator(DecelerateInterpolator()).start()
		super.onDestroyView()
	}

	override fun onResume() {
		super.onResume()
		val num = requireArguments().getInt(ARG_NAV_BAR)
		val navBar: BottomNavigationView = (activity as AppCompatActivity).findViewById(R.id.bottom_navigation_view)
		when(num){
			1 -> navBar.menu.getItem(1).isCheckable = false
			2 -> navBar.menu.getItem(2).isCheckable = false
		}
	}
}

