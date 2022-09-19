package com.example.footschedule.view.loader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.footschedule.databinding.ActivityLoaderBinding
import com.example.footschedule.databinding.ActivityMainBinding

class LoaderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoaderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}