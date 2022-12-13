package com.example.coinmarket.utils

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import coil.load

fun ImageView.loadImage(url: String?){
    val placeholder = createPlaceHolder(this.context)
    this.load(url){
        crossfade(true)
        crossfade(500)
        placeholder(placeholder)
    }
}

private fun createPlaceHolder(context: Context): CircularProgressDrawable{
    return CircularProgressDrawable(context).apply {
        strokeWidth = 12f
        centerRadius = 40f
        start()
    }
}