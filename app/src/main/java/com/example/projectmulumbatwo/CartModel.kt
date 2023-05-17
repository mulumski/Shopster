package com.example.projectmulumbatwo

import com.google.android.gms.vision.barcode.Barcode

data class CartModel(
    val pid:String? = null ,
    val uid :String? = null,
    val imageUrl :String? = null  ,
    val name : String? = null ,
    val price : String? = null ,
   val barcode: String? = null,
)
