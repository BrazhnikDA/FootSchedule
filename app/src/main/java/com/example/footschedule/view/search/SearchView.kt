package com.example.footschedule.view.search

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.footschedule.data.model.CountryItems
import com.example.footschedule.data.model.EventData

interface SearchView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun displayList(listCountry: List<CountryItems>)

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showError()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showLoadingWheel()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun disableLoadingWheel()

    @StateStrategyType(AddToEndSingleStrategy::class)
    fun disableError()
}