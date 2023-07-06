package com.melnik.myshoppingpro.ui


import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.databinding.ActivityMainBinding
import com.melnik.myshoppingpro.ui.favorite.FavoriteListFragment
import com.melnik.myshoppingpro.ui.history.HistoryFragment
import com.melnik.myshoppingpro.ui.main.goodslist.GoodsListFragmentWithoutBanner


class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding

	@RequiresApi(Build.VERSION_CODES.O)
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setTheme(R.style.Theme_MyThemeNew)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setSupportActionBar(findViewById(R.id.toolbar))

		binding.bottomNavigationView.setOnItemSelectedListener {
			when (it.itemId) {
				R.id.bottom_view_home -> {
					navigateTo(GoodsListFragmentWithoutBanner())
					true
				}
				R.id.bottom_view_favorites -> {
					navigateTo(FavoriteListFragment())
					true
				}
				R.id.bottom_view_history -> {
					navigateTo(HistoryFragment())
					true
				}
				else -> true
			}
		}
		binding.bottomNavigationView.selectedItemId = R.id.bottom_view_home

	}

	private fun navigateTo(fragment: Fragment) {
		supportFragmentManager
			.beginTransaction()
			.replace(R.id.container_frame, fragment)
			.commit()
	}
}
