package com.weather.forecastmvvm.ui.weather.today

import androidx.lifecycle.ViewModel;
import com.weather.forecastmvvm.Internal.UnitSystem
import com.weather.forecastmvvm.Internal.lazyDeferred
import com.weather.forecastmvvm.data.repository.ForecastRepository

class CurrentweatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC //get from settings later

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}