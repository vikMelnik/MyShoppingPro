package com.melnik.myshoppingpro.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HistoryViewModel(private val repository: Repository) : ViewModel() {
	private val historyLiveDataLocal: MutableLiveData<AppState> = MutableLiveData()
	val historyLiveData: LiveData<AppState> get() = historyLiveDataLocal

	fun getAllHistoryTwo() {
		historyLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			historyLiveDataLocal.postValue(AppState.Success(repository.getAllWebHistoryTwo()))
		}
	}

	fun clearAllHistory() {
		historyLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			historyLiveDataLocal.postValue(AppState.Success(repository.clearAllHistoryFromDb()))
		}
	}

	fun deleteFromHistoryByScreen(screen: String?) {
		historyLiveDataLocal.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			historyLiveDataLocal.postValue(AppState.Success(repository.deleteHistoryByScreen(screen)))
		}
	}
}