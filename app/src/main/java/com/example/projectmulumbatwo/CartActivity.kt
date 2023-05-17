package com.example.shopster

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.projectmulumbatwo.databinding.ActivityMainBinding
import com.google.android.play.core.integrity.i
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class CartActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: ArrayList<Int>
    lateinit var nameList: ArrayList<String>
    lateinit var priceList: ArrayList<String>
    lateinit var tvtotal:TextView
    lateinit var btncheckout:Button
    private lateinit var auth: FirebaseAuth
    var db = Firebase.firestore
    private var orderDatabaseReference = Firebase.firestore.collection("products")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        auth = FirebaseAuth.getInstance()

        val productList = listOf("Product 1", "Product 2", "Product 3")
        val totalPrice = 100.0
        val timeOfPayment = System.currentTimeMillis()


          imageList = arrayListOf(
              R.drawable.img,
              R.drawable.listitem

          )
        nameList = arrayListOf(
            "Naivas whole Bread 400g",
            "Cocacola zero 2L"
        )

        priceList = arrayListOf(
            "65.00",
            "168.00"
        )



        fun getData() {
            for (i in imageList.indices) {
                val dataClass = DataClass(imageList[i], nameList[i], priceList[i])
                dataList.add(dataClass)
            }

            recyclerView.adapter = ProductAdapter(dataList)
        }
        btncheckout.setOnClickListener{
            var intent= Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }

         getData()

    }
}

