package com.example.androidkotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidkotlinbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        val view = mainBinding.root
        setContentView(view)

        mainBinding.button5.setOnClickListener {

            mainBinding.textView2.text = mainBinding.editTextTextPersonName2.text.toString()

        }

    }
}