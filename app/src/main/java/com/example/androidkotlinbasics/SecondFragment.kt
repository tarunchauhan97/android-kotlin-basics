package com.example.androidkotlinbasics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {


    lateinit var imageView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //cannot access findviewbyid directy use design of secondfragment


        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        imageView = view.findViewById(R.id.imageView2)
        val position = arguments?.getInt("position", 0)
        // Inflate the layout for this fragment
        when (position) {
            0 -> imageView.setImageResource(R.drawable.berlin)
            1 -> imageView.setImageResource(R.drawable.athens)
            2 -> imageView.setImageResource(R.drawable.rome)
            3 -> imageView.setImageResource(R.drawable.tokyo)
            4 -> imageView.setImageResource(R.drawable.amsterdam)

        }
        return view

    }

}