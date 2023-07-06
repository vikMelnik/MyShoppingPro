package com.melnik.myshoppingpro


sealed class AppState {
    data class Success<T>(var data: T) : AppState()
    data class Error(val error: Throwable) : AppState()
    data class Loading(val progress: Int?) : AppState()
}
