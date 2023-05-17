package com.example.projectmulumbatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class First_Activity : AppCompatActivity() {
    lateinit var imgintro:ImageView
    lateinit var tvintottl:TextView
    lateinit var tvIntroexp:TextView
    lateinit var btnGetStart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        imgintro=findViewById(R.id.imgvwintro)
        tvintottl=findViewById(R.id.tvintottl)
        tvIntroexp=findViewById(R.id.tvintroexp)
        btnGetStart=findViewById(R.id.btnGetStarted)

        btnGetStart.setOnClickListener{
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }
    }
}