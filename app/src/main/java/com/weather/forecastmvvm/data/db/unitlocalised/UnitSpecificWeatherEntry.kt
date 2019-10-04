package com.weather.forecastmvvm.data.db.unitlocalised

import com.google.gson.annotations.SerializedName

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val weatherCode: Int

    val weatherDescriptions: String

    val weatherIcons: String

    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}