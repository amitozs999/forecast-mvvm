package com.weather.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.weather.forecastmvvm.data.db.unitlocalised.UnitSpecificCurrentWeatherEntry


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}