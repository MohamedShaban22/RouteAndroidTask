package com.example.routeandroidtask

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.ProductsItem
import com.example.domain.usecase.GetProducts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel@Inject constructor(private  val getProducts:GetProducts)
    :ViewModel () {
        val products=MutableLiveData<List<ProductsItem?>>()
    val priceBeforeDiscount=MutableLiveData<String?>()

    suspend fun getProducts() {
        viewModelScope.launch {
            try {
                products.postValue(getProducts.invoke().products)
            }catch (e:Exception){
                Log.e("getProductsException",e.localizedMessage?:"")
            }
        }
    }


   suspend fun calculateDiscount(position:Int){



       viewModelScope.launch {
           try {
               priceBeforeDiscount.postValue(getProducts.invoke()
                   .products?.get(position)?.discountPercentage.toString())
           }catch (e:Exception){
               Log.e("priceDis Ex: ",e.localizedMessage?:"")
           }
       }
    }
}