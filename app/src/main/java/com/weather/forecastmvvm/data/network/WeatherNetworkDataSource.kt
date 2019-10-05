package com.weather.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.weather.forecastmvvm.data.network.response.currentWeatherResponse

interface WeatherNetworkDataSource {

    val downloadedCurrentWeather: LiveData<currentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String
    )
}