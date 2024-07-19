package com.example.routeandroidtask

import ProductsAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.routeandroidtask.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var viewBinding:ActivityMainBinding
    lateinit var adapter: ProductsAdapter
    lateinit var viewModel: ProductsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this)[ProductsViewModel::class.java]

        initViews()
    }

    private fun initViews() {

        adapter=ProductsAdapter()
        viewBinding.recyclerView.adapter=adapter


        lifecycleScope.launch {
            viewModel.getProducts()
        }

        lifecycleScope.launch {
            viewModel.products.observe(this@MainActivity){
                try {
                    adapter.bindProductsList(it.toMutableList())
                }catch (e:Exception){
                    Log.e("MainActivityEx : ",e.localizedMessage?:"")
                }
            }
        }

    }
}