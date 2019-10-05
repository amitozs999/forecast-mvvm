package com.weather.forecastmvvm.data.db.unitlocalised

import androidx.room.ColumnInfo

data class MetricWeatherEntry(
//    @ColumnInfo(name = "tempC")
//    override val temperature: Double,
//    @ColumnInfo(name = "weather_Descriptions")
//    override val weatherDescriptions: String,
//    @ColumnInfo(name = "weather_icon")
//    override val weatherIcons: String,
//    @ColumnInfo(name = "weather_Code")
//    override val weatherCode: Int,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Int,
//    @ColumnInfo(name = "windDir")
//    override val windDirection: String,
//    @ColumnInfo(name = "precipMm")
//    override val precipitationVolume: Double,
    @ColumnInfo(name = "feelslike")
    override val feelslike: Int
//    @ColumnInfo(name = "visKm")
//    override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry