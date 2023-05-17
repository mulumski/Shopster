package com.example.projectmulumbatwo

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Point
import android.os.Bundle
import android.text.TextUtils
import android.view.Display
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.projectmulumbatwo.databinding.ActivityGeneratorBinding
import com.google.zxing.BarcodeFormat
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter
import java.net.URLEncoder.encode

class GeneratorActivity : AppCompatActivity() {

    private lateinit var qrIV: ImageView
    private lateinit var msgEdt: EditText
    private lateinit var generateQRBtn: Button

    private lateinit var bitmap: Bitmap
    private val qrCodeWriter = QRCodeWriter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generator)

        qrIV = findViewById(R.id.idIVQrcode)
        msgEdt = findViewById(R.id.idEdt)
        generateQRBtn = findViewById(R.id.idBtnGenerateQR)

        val productList = listOf("Product 1", "Product 2", "Product 3")
        val totalPrice = 100.0
        val timeOfPayment = System.currentTimeMillis()

        val checkoutData = CheckoutData(productList, totalPrice, timeOfPayment)

        generateQRBtn.setOnClickListener {
            val windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
            val display = windowManager.defaultDisplay
            val point = Point()
            display.getSize(point)

            val width = point.x
            val height = point.y
            var dimen = if (width < height) width else height
            dimen *= 3 / 4

            val contents =
                "Products: ${checkoutData.itemList.joinToString()}\nTotal price: ${checkoutData.totalPrice}\nTime of payment: ${checkoutData.timeOfPayment}"

            try {
                val bitMatrix = qrCodeWriter.encode(contents, BarcodeFormat.QR_CODE, width, height)
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)

                val qrCodeImageView = findViewById<ImageView>(R.id.idIVQrcode)
                qrCodeImageView.setImageBitmap(bitmap)
                qrIV.setImageBitmap(bitmap)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}