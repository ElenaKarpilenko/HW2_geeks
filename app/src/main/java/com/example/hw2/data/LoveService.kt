package com.example.hw2.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object LoveService {

    fun provideApi():LoveApiService{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://love-calculator.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(LoveApiService::class.java)
    }
}