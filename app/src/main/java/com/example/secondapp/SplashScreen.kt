package com.example.secondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() { // Code for my splash screen
    private val SPLASH_TIME_OUT: Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        android.os.Handler().postDelayed({
            startActivity(Intent(this, MainActivity:: class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}