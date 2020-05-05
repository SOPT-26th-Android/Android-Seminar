package com.example.firstseminar.data

import com.google.gson.annotations.SerializedName

data class ResponseLogin(
    val status : Int,
    val success : Boolean,
    @SerializedName("data")
    val responseData : SomeData?
)

data class SomeData(
    val jwt : String
)