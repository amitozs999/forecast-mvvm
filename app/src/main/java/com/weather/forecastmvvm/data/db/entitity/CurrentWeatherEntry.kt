package com.weather.forecastmvvm.data.db.entitity


import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


const val CURRENT_WEATHER_ID = 0
//
//object Converters {
//    @TypeConverter
//    fun fromString(value: String): ArrayList<String> {
//        val listType = object : TypeToken<ArrayList<String>>() {
//
//        }.type
//        return Gson().fromJson(value, listType)
//    }
//
//    @TypeConverter
//    fun fromArrayList(list: ArrayList<String>): String {
//        val gson = Gson()
//        return gson.toJson(list)
//    }
//}

@Entity(tableName = "current_weather")
//@TypeConverters({Converters.class})

data class CurrentWeatherEntry(
    val feelslike: Int,
//    val humidity: Double,
//    @SerializedName("is_day")
//    val isDay: String,
//    @SerializedName("observation_time")
//    val observationTime: String,
//    val precip: Double,
//    val pressure: Double,
//    val temperature: Double,
//    @SerializedName("uv_index")
//    val uvIndex: Double,
//    val visibility: Double,
//    @SerializedName("weather_code")
//    val weatherCode: Int,
//    @SerializedName("weather_descriptions")
//    val weatherDescriptions: String,
//    @SerializedName("weather_icons")
//    val weatherIcons: String,
//    @SerializedName("wind_degree")
//    val windDegree: Double,
//    @SerializedName("wind_dir")
//    val windDir: String,
     @SerializedName("wind_speed")
    val windSpeed: Int
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}