package com.fadhil.produk_app_api.service


import com.fadhil.produk_app_api.model.ResponseProduk
import retrofit2.Call
import retrofit2.http.GET

interface ProdukService {
    @GET("products") //end point
    fun getAllProduk(): retrofit2.Call<ResponseProduk>
}