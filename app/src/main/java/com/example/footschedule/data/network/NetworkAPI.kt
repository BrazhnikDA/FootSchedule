package com.example.footschedule.data.network

import com.example.footschedule.data.SharedData
import com.example.footschedule.data.network.api.PlaceHolderEventsAPI
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class NetworkAPI {

    private lateinit var mInstance: NetworkAPI
    private val url = SharedData.URL_API
    private var retrofit: Retrofit

    init {
        val TIME_WAIT_RESPONSE_API = 1500
        val okHttpClient =
            OkHttpClient().newBuilder()
                .connectTimeout(TIME_WAIT_RESPONSE_API.toLong(), TimeUnit.MILLISECONDS)
                .readTimeout(TIME_WAIT_RESPONSE_API.toLong(), TimeUnit.MILLISECONDS)
                .writeTimeout(TIME_WAIT_RESPONSE_API.toLong(), TimeUnit.MILLISECONDS)
                .build()


        val gson = GsonBuilder()
            .setLenient()
            .create()

        retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
    }

    fun getInstance(): NetworkAPI {
        return mInstance
    }

    fun getJSONEventsAPI(): PlaceHolderEventsAPI {
        return retrofit.create(PlaceHolderEventsAPI::class.java)
    }

}