package com.weather.forecastmvvm.ui.weather.future.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.weather.forecastmvvm.R

class weatherdetail : Fragment() {

    companion object {
        fun newInstance() = weatherdetail()
    }

    private lateinit var viewModel: WeatherdetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.weatherdetail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WeatherdetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
