package com.weather.forecastmvvm.data.db.entitity


import com.google.gson.annotations.SerializedName

data class Request(
    val language: String,
    val query: String,
    val type: String,
    val unit: String
)