package com.example.footschedule.data.network.service

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.footschedule.data.SharedData
import com.example.footschedule.data.model.EventData
import com.example.footschedule.data.network.NetworkAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ServiceEvents {

    fun getAllEventsAPI(
        result: MutableLiveData<EventData>,
        status: MutableLiveData<String>
    ) {
        NetworkAPI().getJSONEventsAPI().getEventsToday("2022-09-18", "1").enqueue(object : Callback<EventData> {
            override fun onResponse(
                call: Call<EventData>,
                response: Response<EventData>
            ) {
                Log.e("Logs_response", response.body().toString())

                result.postValue(response.body())
                status.postValue("RESPONSE_OK")
            }

            override fun onFailure(call: Call<EventData>, t: Throwable) {
                Log.e("Logs_Error", t.toString())
                status.postValue("Error connection")
            }
        })
    }

    fun getTopEventsAPI(
        result: MutableLiveData<EventData>,
        status: MutableLiveData<String>,
        dateStart: String,
        dateEnd: String,
        leagueID: String
    ) {
        NetworkAPI().getJSONEventsAPI().getTopEventsToday(SharedData.SPORT_ID,dateStart, dateEnd, leagueID).enqueue(object : Callback<EventData> {
            override fun onResponse(
                call: Call<EventData>,
                response: Response<EventData>
            ) {
                Log.e("Logs_response", response.body().toString())

                result.postValue(response.body())
                status.postValue("RESPONSE_OK")
            }

            override fun onFailure(call: Call<EventData>, t: Throwable) {
                Log.e("Logs_Error", t.toString())
                status.postValue("Error connection")
            }
        })
    }
}