package com.example.androidkotlinbasics

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var item: EditText
    lateinit var add: Button
    lateinit var listView: ListView
    var itemList = ArrayList<String>()
    var fileHelper = FileHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        item = findViewById(R.id.editText)
        add = findViewById(R.id.button6)
        listView = findViewById(R.id.listtodo)
        itemList = fileHelper.readData(this)
        var arrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemList)

        listView.adapter = arrayAdapter

        add.setOnClickListener {

            if (item.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Empty", Toast.LENGTH_SHORT).show()
            } else {
                var itemName: String = item.text.toString()

                itemList.add(itemName)

                item.setText("")

                fileHelper.writeData(itemList, applicationContext)
                arrayAdapter.notifyDataSetChanged()
            }
        }

        listView.setOnItemClickListener { adapterView, view, position, id ->

            var alert = AlertDialog.Builder(this)

            alert.setTitle("Delete")
            alert.setMessage("Do You want to Delete?")
            alert.setCancelable(false)
            alert.setNegativeButton(
                "No",
                DialogInterface.OnClickListener { dialogInterface, which ->
                    dialogInterface.cancel()

                })
            alert.setPositiveButton(
                "Yes",
                DialogInterface.OnClickListener { dialogInterface, which ->

                    itemList.removeAt(position)
                    arrayAdapter.notifyDataSetChanged()
                    fileHelper.writeData(itemList, applicationContext)

                })

            alert.create().show()
        }

    }
}