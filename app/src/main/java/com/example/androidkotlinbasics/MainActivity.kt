package com.example.androidkotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var buttonone: Button
    lateinit var buttonActivity: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        buttonone = findViewById(R.id.button3)
        buttonActivity = findViewById(R.id.buttonActivity)

        buttonone.setOnClickListener {
            counter = counter + 1
            textView.text = "" + counter
        }
        buttonActivity.setOnClickListener {

            var intent = Intent(this@MainActivity,SecondActivity::class.java)

            startActivity(intent)

        }

        Log.d("Message", "First Activate onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First Activate onStart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First Activate onPause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First Activate onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First Activate onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First Activate onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First Activate onDestroy")

    }

}