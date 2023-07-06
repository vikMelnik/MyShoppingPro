package com.melnik.myshoppingpro.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.melnik.myshoppingpro.R
import com.melnik.myshoppingpro.ui.main.goodslist.GoodsListFragmentWithoutBanner


abstract class BaseViewBindingFragment<T : ViewBinding>(
	private val inflateBinding: (
		inflater: LayoutInflater, root: ViewGroup?, attachToRoot: Boolean
	) -> T
) : Fragment() {
	private var _binding: T? = null
	protected val binding: T
		get() = _binding!!
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = inflateBinding.invoke(inflater, container, false)
		return binding.root
	}

	fun navigateToFragment(
		fragment: Fragment
	) {
			parentFragmentManager
				.beginTransaction()
				.replace(R.id.container_frame, fragment)
				.commit()

	}

	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
	companion object {
		fun newInstance() = GoodsListFragmentWithoutBanner()	}
}