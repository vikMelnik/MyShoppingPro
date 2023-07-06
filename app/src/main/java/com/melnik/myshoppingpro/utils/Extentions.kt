package com.melnik.myshoppingpro.utils

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import android.util.Base64
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleOwner
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.base.IFromDialog
import com.melnik.myshoppingpro.ui.App
import com.melnik.myshoppingpro.ui.main.goodslist.GoodsListFragmentWithoutBanner
import java.io.ByteArrayOutputStream


fun View.showSnackBar(
	text: String,
	actionText: String,
	length: Int = Snackbar.LENGTH_INDEFINITE,
	action: (View) -> Unit,
) {
	Snackbar.make(this, text, length).setAction(actionText, action).show()
}

@Suppress("DEPRECATION")
fun createShare(pic: String, strUrl: String, activity: AppCompatActivity) {
	//create image
	val img = try {
		val imageBytes = Base64.decode(pic, 0)
		BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)
	} catch (e: Exception) {
		e.message
		null
	}
	//resize picture
	val path = MediaStore.Images.Media.insertImage(
		App.instance.contentResolver,
		img,
		"Image I want to share",
		null
	)
	val uri = Uri.parse(path)

	val shareIntent = Intent()
	shareIntent.action = Intent.ACTION_SEND
	shareIntent.putExtra(Intent.EXTRA_TEXT, strUrl)
	shareIntent.putExtra(Intent.EXTRA_STREAM, uri)
	shareIntent.type = "image/*"
	shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

	activity.startActivity(Intent.createChooser(shareIntent, "Share images..."))

}

fun makeBar(activity: AppCompatActivity, string: String) {
	activity.supportActionBar?.show()
	activity.supportActionBar?.title = (activity.resources.getString(R.string.shops) + " " + string)
	val navBar: BottomNavigationView = activity.findViewById(R.id.bottom_navigation_view)
	navBar.visibility = View.VISIBLE
}

fun makeScreenToSave(v: WebView): String {
	var btmp: String? = null
	var num = 1.0

	do {
		val srn: Bitmap = takeScreenshotOfView(v.rootView, num)
		btmp = bitMapToString(srn)
		num -= 0.1
	} while (btmp?.length!! > 2000000)

	Log.d("####", " ${btmp.length}")
	return btmp
}

fun takeScreenshotOfView(rootView: View, double: Double): Bitmap {
	val metricsB = App.instance.resources.displayMetrics
	val width = (metricsB.widthPixels * double).toInt()
	val height = (metricsB.heightPixels * (double - 0.4)).toInt()

	Log.d("####", " width: $width   height: $height")
	// узнаем размеры экрана из класса Display
	val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
	val canvas = Canvas(bitmap)
	val bgDrawable = rootView.background
	if (bgDrawable != null) {
		bgDrawable.draw(canvas)
	} else {
		canvas.drawColor(Color.WHITE)
	}
	rootView.background?.draw(canvas)
	rootView.draw(canvas)
	return bitmap
}

fun bitMapToString(srn: Bitmap): String {

	val baos = ByteArrayOutputStream()
	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
		srn.compress(Bitmap.CompressFormat.WEBP_LOSSY, 100, baos)
	} else {
		srn.compress(Bitmap.CompressFormat.JPEG, 100, baos)
	}
	val b = baos.toByteArray()
	return Base64.encodeToString(b, Base64.DEFAULT)
}

fun createAlertDialogForHistoryAndFavor(activity: AppCompatActivity, n:Int, callback: IFromDialog) {
	var title = ""
	var description = ""
	when(n){
		1 -> {
			title = activity.resources.getString(R.string.dialog_title_clear_all)
			description = activity.resources.getString(R.string.dialog_meaasge_all)
		}
		else ->{
			title = activity.resources.getString(R.string.dialog_title_clear)
			description = activity.resources.getString(R.string.dialog_meaasge)
		}
	}
	MaterialAlertDialogBuilder(activity)
		.setTitle(title)
		.setMessage(description)
		.setNegativeButton(activity.getString(R.string.dialog_decline)) { dialog, _ ->
			dialog.dismiss()
		}
		.setPositiveButton(activity.resources.getString(R.string.dialog_positiv)) { _, _ ->
			callback.fromDialog(true)
		}
		.show()
}

fun createAlertDialogForAddition(activity: AppCompatActivity, str: String, callback: IFromDialog) {
	MaterialAlertDialogBuilder(activity)
		.setTitle(activity.resources.getString(R.string.dialog_title_add))
		.setMessage(activity.resources.getString(R.string.dialog_meaasge_add, str))
		.setNegativeButton(activity.getString(R.string.dialog_decline)) { dialog, _ ->
			dialog.dismiss()
		}
		.setPositiveButton(activity.resources.getString(R.string.dialog_positiv)) { _, _ ->
			callback.fromDialog(true)
		}
		.show()
}

fun createBackCallBack(
	parentFragmentManager: FragmentManager,
	activity: AppCompatActivity,
	viewLifecycleOwner: LifecycleOwner
) {
	val callback = object : OnBackPressedCallback(true) {
		override fun handleOnBackPressed() {
			parentFragmentManager
				.beginTransaction()
				.replace(R.id.container_frame, GoodsListFragmentWithoutBanner.newInstance())
				.commit()
			val navBar: BottomNavigationView = activity.findViewById(R.id.bottom_navigation_view)
			navBar.menu.getItem(0).isChecked = true
		}
	}
	activity.onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
}
fun createToast(s: String) {
	val t = Toast.makeText(App.instance, s, Toast.LENGTH_LONG)
	t.show()
}