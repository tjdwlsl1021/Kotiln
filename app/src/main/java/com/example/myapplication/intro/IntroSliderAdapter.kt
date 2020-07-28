package com.example.myapplication.intro

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


// todo 작업중 - 동영상 15:00분 위치부터 다시
class IntroSliderAdapter(private val in) {
    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)
        private val imageIcon = view.findViewById<ImageView>(R.id.imageSlideIcon)

        fun bind(introSlide: IntroSlide) {
            textTitle.text = introSlide.title
            textDescription.text = introSlide.descriptoin
            imageIcon.setImageResource(introSlide.icon)
        }
    }
}
