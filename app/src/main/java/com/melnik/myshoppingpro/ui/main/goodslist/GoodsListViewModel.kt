package com.melnik.myshoppingpro.ui.main.goodslist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GoodsListViewModel(private val repository: Repository) : ViewModel() {

	private val localLiveData = MutableLiveData<AppState>()
	val liveData: LiveData<AppState> get() = localLiveData

	fun loadData() {
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.Main) {
			localLiveData.postValue(AppState.Success(repository.getGoods()))
		}
	}
}