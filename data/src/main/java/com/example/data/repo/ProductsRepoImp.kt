package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.model.ProductResponse
import com.example.domain.model.ProductsItem
import com.example.domain.repo.ProductsRepo

class ProductsRepoImp (private val apiService: ApiService):ProductsRepo{
    override suspend fun getProductsFromRemote(): ProductResponse =apiService.getProducts()

}