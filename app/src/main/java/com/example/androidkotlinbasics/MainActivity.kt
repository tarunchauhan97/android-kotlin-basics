package com.example.androidkotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var etName: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var etPhone: TextInputEditText
    lateinit var signUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.editTextName)
        etEmail = findViewById(R.id.editTextEmail)
        etPhone = findViewById(R.id.editTextPhone)
        signUp = findViewById(R.id.buttonSignUp)

        signUp.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()
            val phone = etPhone.text.toString().toLong()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("namess", name)
//            intent.putExtra("emailss", email)
//            intent.putExtra("phoness", phone)
            startActivity(intent)

        }
    }
}
