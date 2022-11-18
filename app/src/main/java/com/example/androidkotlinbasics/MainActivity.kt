package com.example.androidkotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.logo_bird)
        supportActionBar!!.setDisplayUseLogoEnabled(true)
        
        setContentView(R.layout.activity_main)
    }
}
