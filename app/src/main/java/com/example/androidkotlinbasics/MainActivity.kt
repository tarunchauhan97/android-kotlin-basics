package com.example.androidkotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goButton: Button = findViewById(R.id.buttonGo)

        goButton.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish() // if this used then back button exit the application

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }
}