package com.example.firstseminar.network

import com.example.firstseminar.data.RequestLogin
import com.example.firstseminar.data.ResponseLogin
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{
    @POST("/user/signup")
    fun requestLogin(@Body body : RequestLogin) : Call<ResponseLogin>
}