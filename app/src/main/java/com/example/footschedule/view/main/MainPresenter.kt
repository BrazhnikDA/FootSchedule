package com.example.footschedule.view.main

import androidx.lifecycle.MutableLiveData
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.footschedule.data.helper.ModelEventsHelper
import com.example.footschedule.data.model.EventData

@InjectViewState
class MainPresenter: MvpPresenter<MainView>() {

    val listEvents: MutableLiveData<EventData> = MutableLiveData()
    val statusResponse: MutableLiveData<String> = MutableLiveData()

    private val modelEventsHelper: ModelEventsHelper = ModelEventsHelper(listEvents, statusResponse)

    fun getEventsToday() {
        modelEventsHelper.getAllEventsAPI()
    }

    fun getTopEventsToday() {
        modelEventsHelper.getTopEventsAPI()
    }

    fun getEventsByLeague(key: String) {
        modelEventsHelper.getEventsByLeague(key)
    }

}