package com.example.footschedule.data.helper

import androidx.lifecycle.MutableLiveData
import com.example.footschedule.data.model.EventData
import com.example.footschedule.data.network.service.ServiceEvents

class ModelEventsHelper(
    private val listEvents: MutableLiveData<EventData>,
    private val status: MutableLiveData<String>
) {

    private val serviceEvents: ServiceEvents = ServiceEvents()

    fun getAllEventsAPI() {
        serviceEvents.getAllEventsAPI(listEvents, status)
    }

    fun getTopEventsAPI() {
        serviceEvents.getAllEventsAPI(listEvents, status)
    }

    fun getEventsByLeague(key: String) {
        serviceEvents.getTopEventsAPI(listEvents, status, "2022-09-18", "2022-09-19", key)
    }
}