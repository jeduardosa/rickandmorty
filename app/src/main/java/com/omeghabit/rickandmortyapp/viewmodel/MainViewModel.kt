package com.omeghabit.rickandmortyapp.viewmodel

import android.os.Bundle
import com.omeghabit.rickandmortyapp.R

class MainViewModel {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}