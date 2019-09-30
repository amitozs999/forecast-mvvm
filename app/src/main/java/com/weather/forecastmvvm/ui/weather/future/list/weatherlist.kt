package com.weather.forecastmvvm.ui.weather.future.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.weather.forecastmvvm.R

class weatherlist : Fragment() {

    companion object {
        fun newInstance() = weatherlist()
    }

    private lateinit var viewModel: WeatherlistViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.weatherlist_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherlistViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
