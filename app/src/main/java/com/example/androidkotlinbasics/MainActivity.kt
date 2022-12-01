package com.example.androidkotlinbasics

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidkotlinbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        mainBinding.buttonSend.setOnClickListener {

            val userAddress = mainBinding.editTextEmailAddress.text.toString()
            val userSubject = mainBinding.editTextSubject.text.toString()
            val userMessage = mainBinding.editTextMessage.text.toString()
            sendEmail(userAddress, userSubject, userMessage)
        }
    }

    fun sendEmail(userAddress: String, userSubject: String, userMessage: String) {

        val emailAddress = arrayOf(userAddress)
        val emailIntent = Intent(Intent.ACTION_SENDTO)
        emailIntent.data = Uri.parse("mailto:")

//        val emailIntent = Intent(Intent.ACTION_SEND)
//emailIntent.type = "text/plain"
        //emailIntent.type = "*/*"
//in manifest change android:name="android.intent.action.SEND"
        //android:mimeType = */* // add this line between
//this will show all applications as alternative for sending email

        emailIntent.putExtra(Intent.EXTRA_EMAIL, emailAddress)
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, userSubject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, userMessage)

        if (emailIntent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(emailIntent, "Choose an App"))
        }

    }

}

