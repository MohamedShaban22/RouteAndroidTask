package com.example.routeandroidtask;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u0007\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"bindSrcImage", "", "imageView", "Landroid/widget/ImageView;", "imgUrl", "", "", "setFormattedPrice", "textView", "Landroid/widget/TextView;", "price", "", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "setFormattedRating", "rating", "", "(Landroid/widget/TextView;Ljava/lang/Float;)V", "app_debug"})
public final class BindAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"app:srcImage"})
    public static final void bindSrcImage(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:formattedRating"})
    public static final void setFormattedRating(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable
    java.lang.Float rating) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:formattedPrice"})
    public static final void setFormattedPrice(@org.jetbrains.annotations.NotNull
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable
    java.lang.Double price) {
    }
}