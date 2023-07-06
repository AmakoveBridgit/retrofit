package com.example.myshop

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    var retrofit =Retrofit.Builder()
        .baseUrl("https://dummyjson.com")
        .addConverterFactory(GsonConverterFactory.create()) //convert json to kotlin objects
        .build()

    fun <T> buildClient(apiInterface: Class <T>):T {
        return retrofit.create(apiInterface)
    }

}
//Retrofit is a library that makes it easy to make HTTP requests to APIs

