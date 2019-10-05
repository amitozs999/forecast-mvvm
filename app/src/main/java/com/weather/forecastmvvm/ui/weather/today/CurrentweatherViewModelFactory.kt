package com.weather.forecastmvvm.ui.weather.today

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.weather.forecastmvvm.data.repository.ForecastRepository

class CurrentweatherViewModelFactory(
    private val forecastRepository: ForecastRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CurrentweatherViewModel(forecastRepository) as T
    }
}