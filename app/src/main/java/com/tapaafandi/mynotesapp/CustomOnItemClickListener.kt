package com.tapaafandi.mynotesapp

import android.view.View

class CustomOnItemClickListener(private val position: Int, private val onItemClickCallback: OnItemClickCallback) : View.OnClickListener {
    override fun onClick(v: View?) {
        if (v != null) {
            onItemClickCallback.onItemClicked(v, position)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(view: View, position: Int)
    }
}