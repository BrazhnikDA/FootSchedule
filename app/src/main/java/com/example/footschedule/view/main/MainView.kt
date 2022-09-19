package com.example.footschedule.view.main

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.footschedule.data.model.EventData

interface MainView: MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun displayList(listEvents: EventData)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showError()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showLoadingWheel()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun disableLoadingWheel()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun disableError()
}