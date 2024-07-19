package com.example.routeandroidtask

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("app:srcImage")
fun bindSrcImage(imageView: ImageView, imgUrl: List<String?>?) {
    if (!imgUrl.isNullOrEmpty()) {
        Glide.with(imageView.context)
            .load(imgUrl[0]) // Load the first image in the list
            .into(imageView)
    } else {
        // Optionally, handle the case where the image list is empty or null
        imageView.setImageResource(R.drawable.product_img) // Replace with your placeholder image
    }
}


@BindingAdapter("app:formattedRating")
fun setFormattedRating(textView: TextView, rating: Float?) {
    val formattedRating = String.format("%.1f", rating ?: 0f)
    textView.text = "Review( $formattedRating )"
}


@BindingAdapter("app:formattedPrice")
fun setFormattedPrice(textView: TextView, price: Double?) {
    val formattedPrice = String.format("EGP %.2f", price ?: 0.0)
    textView.text = formattedPrice
}