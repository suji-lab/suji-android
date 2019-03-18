package com.suji.android.suji_android

import android.app.Activity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.suji.android.suji_android.databinding.CreateFoodBinding




class CreateFoodDialog : Activity() {
    private lateinit var binding: CreateFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
        layoutParams.dimAmount = 0.7f
        window.attributes = layoutParams
        initView()
        val point = DisplayHelper.Singleton.getDisplaySize()
        window.attributes.width = (point.x * 0.9).toInt()
        window.attributes.height = (point.y * 0.7).toInt()
    }

    private fun initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.create_food)
    }
}