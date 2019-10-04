package com.weather.forecastmvvm.ui.weather.today

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.weather.forecastmvvm.R
import com.weather.forecastmvvm.data.network.apiservice
import kotlinx.android.synthetic.main.todayweatherfragment_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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

        val service= apiservice()
        GlobalScope.launch(Dispatchers.Main)
        {
            val currentWeatherResponse=service.getCurrent("new delhi").await()
            Log.d("abc",currentWeatherResponse.toString())
            tv1.text=currentWeatherResponse.toString()

        }
    }

}
