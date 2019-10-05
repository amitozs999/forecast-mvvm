package com.weather.forecastmvvm.ui.weather.today

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer

import com.weather.forecastmvvm.R
import com.weather.forecastmvvm.data.network.ConnectivityInterceptorImpl
import com.weather.forecastmvvm.data.network.WeatherNetworkDataSourceImpl
import com.weather.forecastmvvm.data.network.apiservice
import com.weather.forecastmvvm.ui.base.ScopedFragment
import kotlinx.android.synthetic.main.todayweatherfragment_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.closestKodein
import org.kodein.di.generic.instance

class CurrentweatherFragment : ScopedFragment(), KodeinAware {

//    companion object {
//        fun newInstance() = CurrentweatherFragment()
//    }

    override val kodein by closestKodein()
    private val viewModelFactory: CurrentweatherViewModelFactory by instance()

    private lateinit var viewModel: CurrentweatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.todayweatherfragment_fragment, container, false)
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(CurrentweatherViewModel::class.java)
//
//
//        val service= apiservice(ConnectivityInterceptorImpl(this.context!!)) //apiservice() this impl goes to invoke() inside api service
//
//        val weatherNetworkDataSource = WeatherNetworkDataSourceImpl(service)
//
//        weatherNetworkDataSource.downloadedCurrentWeather.observe(this, Observer {
//            tv1.text = it.toString()
//        })
//
//        GlobalScope.launch(Dispatchers.Main)
//        {
//           // val currentWeatherResponse=service.getCurrent("new delhi").await()
//            //Log.d("abc",currentWeatherResponse.toString())
//            //tv1.text=currentWeatherResponse.toString()
//            weatherNetworkDataSource.fetchCurrentWeather("new delhi") //when offline then it golbal scope open app using saved data source preventing the crash
//        }
//    }
override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    viewModel = ViewModelProviders.of(this, viewModelFactory)
        .get(CurrentweatherViewModel::class.java)

    bindUI()
}

    private fun bindUI() = launch {
        val currentWeather = viewModel.weather.await()
        currentWeather.observe(this@CurrentweatherFragment, Observer {
            if (it == null) return@Observer

            tv1.text = it.toString()
        })
    }


}
