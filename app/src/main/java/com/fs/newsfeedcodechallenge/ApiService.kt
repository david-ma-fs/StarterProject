package com.fs.newsfeedcodechallenge

import retrofit2.Retrofit
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "TODO" //TODO


private val retrofit = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .client(
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    )
    .addConverterFactory(GsonConverterFactory.create())
    .build()

interface ApiService {

    //TODO
}

val apiService: ApiService = retrofit.create(ApiService::class.java)
