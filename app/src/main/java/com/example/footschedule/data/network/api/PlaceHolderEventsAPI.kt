package com.example.footschedule.data.network.api

import com.example.footschedule.data.model.EventData
import retrofit2.Call
import retrofit2.http.*

interface PlaceHolderEventsAPI {
    @Headers(
        "X-RapidAPI-Key: 50c83ca6ddmsh62ae0cb2869d8dbp134021jsn1379cdd806be",
        "X-RapidAPI-Host: sportscore1.p.rapidapi.com"
    )
    @GET("date/{date}")
    fun getEventsToday(@Path("date") date: String, @Query("page") page: String): Call<EventData>

    @Headers(
        "X-RapidAPI-Key: 50c83ca6ddmsh62ae0cb2869d8dbp134021jsn1379cdd806be",
        "X-RapidAPI-Host: sportscore1.p.rapidapi.com"
    )
    @POST("search")
    fun getTopEventsToday(
        @Query("sport_id") sport_id: String,
        @Query("date_start") date_start: String,
        @Query("date_end") date_end: String,
        @Query("league_id") league_id: String
    ): Call<EventData>
}