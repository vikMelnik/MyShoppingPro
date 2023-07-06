package com.melnik.myshoppingpro.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class FavoriteListViewModel(private val repository: Repository) : ViewModel() {

	private val favoriteLiveDataLocal: MutableLiveData<AppState> = MutableLiveData()
	val favoriteLiveData: LiveData<AppState> get() = favoriteLiveDataLocal

	fun getAllFavorite() {
		favoriteLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			favoriteLiveDataLocal.postValue(AppState.Success(repository.getAllShopsFavorite()))
		}
	}

	fun deleteFromFavoriteByTitle(titleShop: String?) {
		favoriteLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			favoriteLiveDataLocal.postValue(AppState.Success(repository.deleteFavorByTitle(titleShop)))
		}
	}

	fun clearAllFavorite() {
		favoriteLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			favoriteLiveDataLocal.postValue(AppState.Success(repository.clearAllFavoriteFromDb()))
		}
	}
}
