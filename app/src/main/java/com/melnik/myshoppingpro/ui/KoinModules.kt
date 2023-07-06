package com.melnik.myshoppingpro.ui

import android.annotation.SuppressLint
import androidx.room.Room
import com.melnik.myshoppingpro.domain.room.DataBase
import com.melnik.myshoppingpro.domain.room.FavoriteEntity
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.models.Goods
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.repository.Repository
import com.melnik.myshoppingpro.repository.RepositoryImpl
import com.melnik.myshoppingpro.ui.favorite.FavoriteListViewModel
import com.melnik.myshoppingpro.ui.history.HistoryViewModel
import com.melnik.myshoppingpro.ui.main.goodslist.GoodsListViewModel
import com.melnik.myshoppingpro.ui.main.shoplist.ShopsListViewModel
import com.melnik.myshoppingpro.ui.web.WebViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module



@SuppressLint("SuspiciousIndentation")
val appModule = module {

	single {
		Room.databaseBuilder(
			App.instance,
			DataBase::class.java,
			"app_database.db"
		).build()
	}
	single<Repository> { RepositoryImpl<List<Shops>>(get()) }
    single<Repository> { RepositoryImpl<Shops>(get()) }
    single<Repository> { RepositoryImpl<ArrayList<Goods>>(get()) }
    single<Repository> { RepositoryImpl<List<Pair<Shops, Boolean>>>(get()) }
    single<Repository> { RepositoryImpl< MutableList<Pair<FavoriteEntity,Boolean>>>(get()) }
    single<Repository> { RepositoryImpl< MutableList<HistoryWebEntityTwo>>(get()) }
	single<Repository> { RepositoryImpl< MutableList<FavoriteEntity>>(get()) }

	//View models
	viewModel { ShopsListViewModel(get()) }
	viewModel { WebViewModel(get()) }
	viewModel { HistoryViewModel(get()) }
	viewModel { FavoriteListViewModel(get()) }
	viewModel { GoodsListViewModel(get()) }
	}

