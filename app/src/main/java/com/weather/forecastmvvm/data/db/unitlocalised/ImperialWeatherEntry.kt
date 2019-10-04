package com.weather.forecastmvvm.data.db.unitlocalised

import androidx.room.ColumnInfo

data class ImperialWeatherEntry(
    @ColumnInfo(name = "tempF")
    override val temperature: Double,
    @ColumnInfo(name = "weather_Descriptions")
    override val weatherDescriptions: String,
    @ColumnInfo(name = "weather_icon")
    override val weatherIcons: String,
    @ColumnInfo(name = "weather_Code")
    override val weatherCode: Int,
    @ColumnInfo(name = "windMph")
    override val windSpeed: Double,
    @ColumnInfo(name = "windDir")
    override val windDirection: String,
    @ColumnInfo(name = "precipIn")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "feelslikeF")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "visMiles")
    override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry