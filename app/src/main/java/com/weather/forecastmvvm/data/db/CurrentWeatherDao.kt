package com.weather.forecastmvvm.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.weather.forecastmvvm.data.db.entitity.CURRENT_WEATHER_ID
import com.weather.forecastmvvm.data.db.entitity.CurrentWeatherEntry
import com.weather.forecastmvvm.data.db.unitlocalised.ImperialWeatherEntry

import com.weather.forecastmvvm.data.db.unitlocalised.MetricWeatherEntry


@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricWeatherEntry>
//
    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialWeatherEntry>
//
}