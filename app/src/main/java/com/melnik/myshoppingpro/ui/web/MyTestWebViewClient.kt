package com.melnik.myshoppingpro.ui.web

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.net.http.SslError
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.webkit.*
import android.widget.ProgressBar
import android.widget.Toast
import com.melnik.myshoppingpro.ui.App
import com.melnik.myshoppingpro.utils.MAX_PROGRESS


object MyTestWebViewClient {

	@SuppressLint("SetJavaScriptEnabled")
	fun createWebView(v: WebView, progressBar: ProgressBar) {

		v.webChromeClient = WebChromeClient()
		v.webViewClient = WebViewClient()
		v.isHorizontalScrollBarEnabled = true
		v.settings.javaScriptEnabled = true
		v.settings.useWideViewPort = true //start
		v.settings.setSupportZoom(true)
		v.settings.builtInZoomControls = true
		v.settings.displayZoomControls = false
		v.settings.loadWithOverviewMode = true
		v.settings.allowFileAccess = true
		v.settings.domStorageEnabled = true
		v.settings.databaseEnabled = true
		v.settings.loadsImagesAutomatically = true
		v.settings.textSize = WebSettings.TextSize.NORMAL
		v.settings.blockNetworkImage = false
		v.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW


		v.webViewClient = object : WebViewClient() {
			override fun shouldOverrideUrlLoading(
				view: WebView,
				request: WebResourceRequest
			): Boolean {
				view.loadUrl(request.url.toString())
				return true
			}

			// Для старых устройств
			@Deprecated("Deprecated in Java")
			override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
				view.loadUrl(url)
				Log.d("@@@", "Move from shouldOverrideUrlLoading $url")
				return true
			}

			@Deprecated("Deprecated in Java")
			override fun onReceivedError(
				view: WebView,
				errorCode: Int,
				description: String,
				failingUrl: String
			) {
				Toast.makeText(App.instance, "No internet connection", Toast.LENGTH_LONG).show()
				view.loadUrl("file:///android_asset/lost.html")
			}

			override fun onReceivedSslError(
				view: WebView,
				handler: SslErrorHandler,
				error: SslError
			) {
				super.onReceivedSslError(view, handler, error)
				handler.cancel()
			}
			override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
				progressBar.visibility = View.VISIBLE
				progressBar.progress = 0
				view?.url
				super.onPageStarted(view, url, favicon)
			}

			override fun onPageFinished(view: WebView?, url: String?) {
				progressBar.visibility = View.GONE
				super.onPageFinished(view, url)
			}
		}
		v.webChromeClient = object : WebChromeClient() {
			override fun onProgressChanged(view: WebView, newProgress: Int) {
				super.onProgressChanged(view, newProgress)
				progressBar.progress = newProgress
				if (newProgress > 0) {
					if (newProgress == MAX_PROGRESS) {
						progressBar.visibility = View.INVISIBLE
					} else {
						progressBar.visibility = View.VISIBLE
					}
				}
			}
			override fun onReceivedTitle(view: WebView, title: String) {
				super.onReceivedTitle(view, title)
			}
		}
	}

	private fun animateWeb(view: WebView) {
		val anim = AnimationUtils.loadAnimation(
			App.instance,
			android.R.anim.slide_in_left
		)
		view.startAnimation(anim)
	}
}

