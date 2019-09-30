package com.weather.forecastmvvm.data


import com.google.gson.annotations.SerializedName

data class todayWeatherResponse(
    val current: Current,
    val location: Location,
    val request: Request
)