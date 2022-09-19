package com.example.footschedule.view.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.footschedule.data.model.EventData
import com.example.footschedule.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity(), MainView, ItemClickListener {

    private lateinit var binding: ActivityMainBinding

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    @ProvidePresenter
    fun providePresenter(): MainPresenter {
        return MainPresenter()
    }

    private val scope = CoroutineScope(Dispatchers.IO)

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainPresenter = providePresenter()

        recyclerView = binding.listRating
        recyclerView.layoutManager = LinearLayoutManager(this)

        val key = intent.extras!!["key"].toString()
        createRequest(key)

        mainPresenter.listEvents.observe(this) {
            displayList(it)
        }

        /*mainPresenter.statusResponse.observe(viewLifecycleOwner) {
            Log.d("Response Rating", it)
            if (it == "OK") {
                disableLoadingWheel()
                disableError()
            }
            if (it == "Error connection") {
                setTitle(resources.getString(R.string.offline))
                disableLoadingWheel()
                showError()
                context?.displayToast(it)
            }
            if(it == "Something went wrong") {
                setTitle(resources.getString(R.string.offline))
                disableLoadingWheel()
                showError()
                context?.displayToast(it)
            }
        }*/
    }

    private fun createRequest(key: String?) {
        if (key != null) {
            mainPresenter.getEventsByLeague(key)
        } else {
            Toast.makeText(this,"Error load country code", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCellClickListener(id: String) {
        Toast.makeText(this,"click $id", Toast.LENGTH_SHORT).show()
    }

    override fun displayList(listEvents: EventData) {
        recyclerView.adapter = MainAdapter(listEvents,this)
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