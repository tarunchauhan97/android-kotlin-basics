package com.example.androidkotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        fillArrays()
        val adapter = AnimalsAdaptor(this, nameList, imageList)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->

            Toast.makeText(
                this@MainActivity,
                "You Selected ${nameList[position]}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun fillArrays() {

        nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Chicken")
        nameList.add("Dog")
        nameList.add("Lion")
        nameList.add("Elephant")
        nameList.add("Zebra")
        nameList.add("Sheep")

        imageList.add(R.drawable.old.toString())
        imageList.add(R.drawable.cat.toString())
        imageList.add(R.drawable.newonee.toString())
        imageList.add(R.drawable.dog.toString())
        imageList.add(R.drawable.lion.toString())
        imageList.add(R.drawable.elep.toString())
        imageList.add(R.drawable.zebra.toString())
        imageList.add(R.drawable.meow.toString())


    }

}


