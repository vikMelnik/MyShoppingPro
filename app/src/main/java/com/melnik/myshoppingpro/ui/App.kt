package com.melnik.myshoppingpro.ui

import android.app.Application
import com.google.android.material.color.DynamicColors
import org.koin.core.context.startKoin

class App : Application() {

	override fun onCreate() {
		super.onCreate()
		DynamicColors.applyToActivitiesIfAvailable(this)

		startKoin {
			//androidContext(this@App)
			instance = this@App
			modules(appModule)
		}
	}

	companion object {
		lateinit var instance: App
			private set
	}
}

