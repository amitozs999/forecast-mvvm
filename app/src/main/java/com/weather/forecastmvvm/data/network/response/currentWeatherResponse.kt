package com.weather.forecastmvvm.data.network.response


import com.weather.forecastmvvm.data.db.entitity.CurrentWeatherEntry
import com.weather.forecastmvvm.data.db.entitity.Location
import com.weather.forecastmvvm.data.db.entitity.Request

data class currentWeatherResponse(
    val current: CurrentWeatherEntry,
    val location: Location,
    val request: Request
)