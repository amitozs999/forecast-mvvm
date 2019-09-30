


package com.weather.forecastmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.weather.forecastmvvm.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var navcontroller:NavController




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navcontroller=Navigation.findNavController(this,R.id.nav_host_fragment)

        bottom_nav.setupWithNavController(navcontroller)
        NavigationUI.setupActionBarWithNavController(this,navcontroller)


    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navcontroller,null)

    }

}







