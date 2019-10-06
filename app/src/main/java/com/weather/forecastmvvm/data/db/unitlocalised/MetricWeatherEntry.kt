package com.weather.forecastmvvm.data.db.unitlocalised

import androidx.room.ColumnInfo

data class MetricWeatherEntry(
    @ColumnInfo(name = "temperature")
    override val temperature: Double,
//    @ColumnInfo(name = "weatherDescriptions")
//    override val weatherDescriptions: List<String>,
//    @ColumnInfo(name = "weatherIcons")
//    override val weatherIcons: String,
//    @ColumnInfo(name = "weather_Code")
//    override val weatherCode: Int,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Int,
    @ColumnInfo(name = "windDir")
    override val windDir: String,
     @ColumnInfo(name = "precip")
   override val precip: Double,
    @ColumnInfo(name = "feelslike")
    override val feelslike: Int,
    @ColumnInfo(name = "visibility")
    override val visibility: Double
) : UnitSpecificCurrentWeatherEntry