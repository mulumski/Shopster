package com.example.projectmulumbatwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ProductActivity : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtBarcode: EditText
    lateinit var edtPrice: EditText
    lateinit var btnsave: Button
    private var db = Firebase.firestore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        edtName = findViewById(R.id.product_name_edit_text)
        edtBarcode = findViewById(R.id.product_barcode_edit_text)
        edtPrice = findViewById(R.id.product_price_edit_text)
        btnsave = findViewById(R.id.add_product_button)



        btnsave.setOnClickListener {
            val nameTEXT = edtName.text.toString()
            val barcodeTEXT = edtBarcode.text.toString()
            val priceTEXT = edtPrice.text.toString().toDouble()


           val productId = FirebaseAuth.getInstance().currentUser!!.uid

           val productmap = hashMapOf(
               "name" to nameTEXT,
                "barcode" to barcodeTEXT,
                "price" to priceTEXT
           )
            db.collection("product").document(productId).set(productmap)
                .addOnSuccessListener {
                    Toast.makeText(this, "Successfully Added", Toast.LENGTH_SHORT).show()
                    edtName.text.clear()
                    edtBarcode.text.clear()
                    edtPrice.text.clear()
                }
                .addOnFailureListener{
                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                }

        }
    }
}