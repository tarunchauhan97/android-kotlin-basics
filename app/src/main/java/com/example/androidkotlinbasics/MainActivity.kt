package com.example.androidkotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message", "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "onStart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "onPause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "onDestroy")

    }

}