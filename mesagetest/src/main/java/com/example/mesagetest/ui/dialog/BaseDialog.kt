package com.example.mesagetest.ui.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import com.example.mesagetest.language.LanguageUtil

//abstract class BaseDialog<T : ViewBinding>(context: Context) : Dialog(context, R.style.Theme_Dialog) {
//
//    protected lateinit var binding: T
//
//    protected abstract fun getViewBinding(): T
//
//    init{
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
//    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = getViewBinding()
//        setContentView(binding.root)
//        setCancelable(true)
//        setup()
//    }
//
//    protected abstract fun setup()
//}

open class BaseDialog(context: Context) : Dialog(context, com.google.android.material.R.style.Theme_AppCompat_Dialog) {
    init {
        LanguageUtil.setupLanguage(context)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }


    override fun show() {
        super.show()
//        CheckAdsResume.isDialogOpen = true
    }

    override fun dismiss() {
        super.dismiss()
//        CheckAdsResume.isDialogOpen = false
    }
    protected fun showKeyBoard(){
        window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

}
