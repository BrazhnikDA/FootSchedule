package com.example.footschedule.view.search

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.footschedule.data.model.CountryItems
import com.example.footschedule.data.model.EventData
import com.example.footschedule.databinding.ActivityLoaderBinding
import com.example.footschedule.databinding.ActivitySearchBinding
import com.example.footschedule.view.main.*
import com.example.footschedule.view.main.ItemClickListener

class SearchActivity : AppCompatActivity(), SearchView, ItemClickListener {

    private lateinit var binding: ActivitySearchBinding

    @InjectPresenter
    lateinit var mainPresenter: SearchPresenter

    @ProvidePresenter
    fun providePresenter(): SearchPresenter {
        return SearchPresenter()
    }

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainPresenter = providePresenter()

        recyclerView = binding.itemsCountry
        recyclerView.layoutManager = LinearLayoutManager(this)

        fillListCountry()
    }

    private fun fillListCountry() {
        displayList(mainPresenter.fillScreen())
    }

    override fun onCellClickListener(key: String) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("key", key);
        startActivity(intent)
    }

    override fun displayList(listCountry: List<CountryItems>) {
        recyclerView.adapter = SearchAdapter(listCountry,this)
    }

    override fun showError() {
        TODO("Not yet implemented")
    }

    override fun showLoadingWheel() {
        TODO("Not yet implemented")
    }

    override fun disableLoadingWheel() {
        TODO("Not yet implemented")
    }

    override fun disableError() {
        TODO("Not yet implemented")
    }
}