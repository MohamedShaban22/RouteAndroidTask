package com.example.routeandroidtask;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.routeandroidtask.databinding.ActivityMainBinding;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/example/routeandroidtask/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "LProductsAdapter;", "getAdapter", "()LProductsAdapter;", "setAdapter", "(LProductsAdapter;)V", "viewBinding", "Lcom/example/routeandroidtask/databinding/ActivityMainBinding;", "getViewBinding", "()Lcom/example/routeandroidtask/databinding/ActivityMainBinding;", "setViewBinding", "(Lcom/example/routeandroidtask/databinding/ActivityMainBinding;)V", "viewModel", "Lcom/example/routeandroidtask/ProductsViewModel;", "getViewModel", "()Lcom/example/routeandroidtask/ProductsViewModel;", "setViewModel", "(Lcom/example/routeandroidtask/ProductsViewModel;)V", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.routeandroidtask.databinding.ActivityMainBinding viewBinding;
    public ProductsAdapter adapter;
    public com.example.routeandroidtask.ProductsViewModel viewModel;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.routeandroidtask.databinding.ActivityMainBinding getViewBinding() {
        return null;
    }
    
    public final void setViewBinding(@org.jetbrains.annotations.NotNull
    com.example.routeandroidtask.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final ProductsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    ProductsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.routeandroidtask.ProductsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.routeandroidtask.ProductsViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
}