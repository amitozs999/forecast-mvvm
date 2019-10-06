package com.weather.forecastmvvm.data.db.unitlocalised

import com.google.gson.annotations.SerializedName

interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
//    val weatherCode: Int
//
//   val weatherDescriptions: List<String>
//
//   val weatherIcons: String

    val windSpeed: Int
//    val windDirection: String
    val precip: Double
    val feelslike: Int
    val visibility: Double
}