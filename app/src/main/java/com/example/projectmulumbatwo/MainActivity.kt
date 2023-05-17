package com.example.projectmulumbatwo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.cardview.widget.CardView
import com.example.projectmulumbatwo.databinding.ActivityMainBinding
import java.security.spec.MGF1ParameterSpec
import okhttp3.*
import com.google.gson.Gson
import java.io.IOException


class MainActivity : AppCompatActivity() {
    lateinit var mbtncheckout: ImageButton
    lateinit var mbtnCart: ImageButton
    lateinit var mtvttlmain: TextView
    lateinit var mimg1: ImageView
    lateinit var cdview: CardView
    lateinit var mimgpic1: ImageView
    lateinit var mImgpic2: ImageView
    lateinit var mimgpic3: ImageView
    lateinit var tvscan: TextView
    lateinit var tvcheckout: TextView
    lateinit var tvCart: TextView
    lateinit var tvscandata:TextView
    lateinit var cdviewpc1: CardView
    lateinit var cdviewpc2: CardView
    lateinit var cdviewpc3: CardView
    lateinit var mbtnscan: ImageButton
    lateinit var mbtnscandata:ImageButton
    lateinit var mbtn_profile:ImageButton
    private var requestCamera: ActivityResultLauncher<String>? = null
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mbtnscan = findViewById(R.id.mbtn_scan)
        tvscandata=findViewById(R.id.tvscandata)
        mbtncheckout = findViewById(R.id.mbtn_checkout)
        mbtnCart = findViewById(R.id.mbtn_cart)
        mtvttlmain = findViewById(R.id.tvtitlemain)
        mimg1 = findViewById(R.id.img1)
        cdview = findViewById(R.id.cdvw1)
        mimgpic1 = findViewById(R.id.imgviewpic1)
        mImgpic2 = findViewById(R.id.imgviewpic2)
        mimgpic3 = findViewById(R.id.imgviewpic3)
        tvCart = findViewById(R.id.tvcart)
        tvscan = findViewById(R.id.tvscan)
        tvcheckout = findViewById(R.id.tvcheckout)
        mbtnscandata=findViewById(R.id.mbtn_Scandata)
        cdviewpc1 = findViewById(R.id.cardviewpic1)
        cdviewpc2 = findViewById(R.id.cardviewpic2)
        cdviewpc3 = findViewById(R.id.cardviewpic3)
        mbtn_profile=findViewById(R.id.mbtn_profile)
        requestCamera = registerForActivityResult(
            ActivityResultContracts
                .RequestPermission(),
        ) {
            if (it) {
                var intent = Intent(this, ScannerActivity::class.java)
                startActivity(intent)

            } else {
                Toast.makeText(
                    this, "Permission not granted",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        mbtnscan.setOnClickListener {
            requestCamera?.launch(android.Manifest.permission.CAMERA)

        }

        mbtnCart.setOnClickListener {
           var intent=Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
        mbtncheckout.setOnClickListener {
            var intent=Intent(this, GeneratorActivity::class.java)
            startActivity(intent)

        }
        mbtnscandata.setOnClickListener{
            var intent=Intent(this, ScanDataActivity::class.java)
            startActivity(intent)
        }
        mbtn_profile.setOnClickListener{
            var intent=Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
