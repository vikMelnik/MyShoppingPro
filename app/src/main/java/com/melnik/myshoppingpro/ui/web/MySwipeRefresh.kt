package com.melnik.myshoppingpro.ui.web

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.melnik.myshoppingpro.R

class MySwipeRefresh @JvmOverloads constructor(
	context: Context, attrs: AttributeSet? = null
) : SwipeRefreshLayout(context, attrs) {

	private var mDeclined = false
	private var mPrevY: Float = 0f

	override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
		when (event.action) {
			MotionEvent.ACTION_DOWN -> {
				mPrevY = event.y

				mDeclined = false
				if (mPrevY > resources.getDimension(R.dimen.disable_swipe_after)){
					mDeclined = true
				}
			}
			MotionEvent.ACTION_MOVE -> {
				if (mDeclined) {
					return false
				}
			}
		}
		return super.onInterceptTouchEvent(event)
	}
}