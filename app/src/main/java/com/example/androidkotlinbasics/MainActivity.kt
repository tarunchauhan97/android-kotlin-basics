package com.example.androidkotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adaptor: CountriesAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(this@MainActivity)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        countryNameList.add("India")
        countryNameList.add("Russia")
        countryNameList.add("Israel")

        detailsList.add("India is Vibrant")
        detailsList.add("Russia is Monarch")
        detailsList.add("Israel is Hardworking")

        imageList.add(R.drawable.myimage)
        imageList.add(R.drawable.login)
        imageList.add(R.drawable.splash)
        adaptor = CountriesAdaptor(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adaptor

    }
}