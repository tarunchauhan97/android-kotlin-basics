package com.example.androidkotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    lateinit var buttontwoactivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttontwoactivity = findViewById(R.id.buttontwoactivity)

        buttontwoactivity.setOnClickListener {
            var intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
        Log.d("Message", "Second Activate onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("Message", "Second Activate onStart")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "Second Activate onPause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "Second Activate onResume")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "Second Activate onStop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "Second Activate onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "Second Activate onDestroy")

    }

}
