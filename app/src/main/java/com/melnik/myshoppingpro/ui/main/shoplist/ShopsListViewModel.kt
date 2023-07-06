package com.melnik.myshoppingpro.ui.main.shoplist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch


class ShopsListViewModel(private val repository: Repository) : ViewModel() {

	private val localLiveData = MutableLiveData<AppState>()
	 val liveData: LiveData<AppState> get() = localLiveData

	fun loadDataNew(idn: Int) {
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.Main) {
			localLiveData.postValue(AppState.Success(repository.getShopsListNew(idn)))
		}
	}

	fun saveToFavorite(shops: Shops) {
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			if (isActive) {
				repository.saveFavoriteEntity(shops)
			}
		}
	}
}
