package com.example.domain.repo

import com.example.domain.model.ProductResponse
import com.example.domain.model.ProductsItem

interface ProductsRepo {
    suspend fun getProductsFromRemote():ProductResponse

}