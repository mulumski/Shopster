package com.example.projectmulumbatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val SPLASH_TIME_OUT:Long = 1000 // 1 sec
            Handler().postDelayed({
                // This method will be executed once the timer is over
                // Start your app main activity

                var intent = Intent(this, First_Activity::class.java)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                // close this activity
                finish()
            }, SPLASH_TIME_OUT)
        }
    }

