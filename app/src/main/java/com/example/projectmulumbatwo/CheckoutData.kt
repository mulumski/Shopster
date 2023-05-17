package com.example.projectmulumbatwo

import android.os.Parcelable

data class CheckoutData(
    val itemList: List<String>,
    val totalPrice: Double,
    val timeOfPayment: Long
)
