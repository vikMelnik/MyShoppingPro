package com.melnik.myshoppingpro.ui.web
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.melnik.myshoppingpro.AppState
import com.melnik.myshoppingpro.domain.room.HistoryWebEntityTwo
import com.melnik.myshoppingpro.models.Shops
import com.melnik.myshoppingpro.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class WebViewModel(private val repository: Repository) : ViewModel() {

	private val localLiveData = MutableLiveData<AppState>()
	val liveData: LiveData<AppState> get() = localLiveData

	fun addToFavorite(shopFavor: Shops?){
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			if (isActive) {
				repository.saveFavoriteEntity(shopFavor)
			}
		}
	}

	fun addToHistoryScrn(titleShops: String?,nameUrl: String?, srn: String?) {
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			if (isActive) {
				repository.saveWebEntityScrn(titleShops, nameUrl, srn)
			}
		}
	}

	fun addToFavoriteFromMyWish(shopFavorFromMyWish: HistoryWebEntityTwo) {
		localLiveData.value = AppState.Loading(null)
		viewModelScope.launch(Dispatchers.IO) {
			if (isActive) {
				repository.saveFavoriteEntityFromMyWish(shopFavorFromMyWish)
			}
		}
	}
}