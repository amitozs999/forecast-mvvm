package com.weather.forecastmvvm.ui.weather.today

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.weather.forecastmvvm.R

class todayweather : Fragment() {

    companion object {
        fun newInstance() = todayweather()
    }

    private lateinit var viewModel: TodayweatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.todayweatherfragment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TodayweatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
