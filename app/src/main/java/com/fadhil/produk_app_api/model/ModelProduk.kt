package com.fadhil.produk_app_api.model

import java.util.AbstractQueue

data class ModelProduk(
    val id : Int,
    val title : String,
    val description : String,
    val category : String,
    val price : Double,
    val brand : String,
    val stock : Int,
    val thumbnail : String

)
