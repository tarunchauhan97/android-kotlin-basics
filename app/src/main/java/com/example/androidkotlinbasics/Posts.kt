package com.example.androidkotlinbasics

import com.google.gson.annotations.SerializedName

data class Posts(

    val userId: Int,
    val Id: Int,
    val title: String,
    @SerializedName("body")
    val subtitle: String

) {


}