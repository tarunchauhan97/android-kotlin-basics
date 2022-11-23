package com.example.androidkotlinbasics

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    lateinit var tvName: TextView
    lateinit var tvEmail: TextView
    lateinit var tvPhone: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tvName = findViewById(R.id.textViewName)
        tvEmail = findViewById(R.id.textViewEmail)
        tvPhone = findViewById(R.id.textViewPhone)
        val intent = intent
        val name = intent.getStringExtra("namess")
        val email = intent.getStringExtra("emailss")
        val phone = intent.getLongExtra("phoness", 0)
        print("======$name======")
        print("======$email======")
        print("======$phone======")
        tvName.text = "Hello $name"
        tvEmail.text = "Your Email Address is: $email"
        tvPhone.text = "Your Phone Number is: $phone"

    }
}