package com.weather.forecastmvvm.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.weather.forecastmvvm.Internal.NoConnectivityException
import com.weather.forecastmvvm.data.network.response.currentWeatherResponse

class WeatherNetworkDataSourceImpl(
    private val WeatherApiService: apiservice
) : WeatherNetworkDataSource {

    private val _downloadedCurrentWeather = MutableLiveData<currentWeatherResponse>()
    override val downloadedCurrentWeather: LiveData<currentWeatherResponse>
        get() = _downloadedCurrentWeather

    override suspend fun fetchCurrentWeather(location: String) {
        try {
            val fetchedCurrentWeather = WeatherApiService
                .getCurrent(location)
                .await()
            _downloadedCurrentWeather.postValue(fetchedCurrentWeather)
        }
        catch (e: NoConnectivityException) {
            Log.e("Connectivity", "No internet connection.", e)
        }
    }
}