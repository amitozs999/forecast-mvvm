package com.weather.forecastmvvm.data.db.entitity


import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.collections.forEach as forEach1


const val CURRENT_WEATHER_ID = 0

//object Converters {
//    @TypeConverter
//    fun fromString(value: String): ArrayList<String> {
//        val listType = object : TypeToken<ArrayList<String>>() {
//
//        }.type
//        return Gson().fromJson(value, listType)
//    }

//    @TypeConverter
//    fun fromArrayList(list: ArrayList<String>): String {
//        val gson = Gson()
//        return gson.toJson(list)
//    }
//}
//data class Descripition(
//    val descripition: List<String> = ArrayList()
//)
//
//class DescriptionConverter {
//
//    @TypeConverter
//    fun todescription(value: String?): Descripition {
//        if (value == null || value.isEmpty()) {
//            return Descripition()
//        }
//
//        val list: List<String> = value.split(",")
//        val longList = ArrayList<String>()
//        for (item in list) {
//            if (!item.isEmpty()) {
//                longList.add(item.toString())
//            }
//        }
//        return Descripition(longList)
//    }
//
//    @TypeConverter
//    fun toString(description: Descripition?): String {
//
//        var string = ""
//
//        if (description == null) {
//            return string
//        }
//
//        description.descripition.forEach1 {
//            string += "$it,"
//        }
//        return string
//    }
//}

@Entity(tableName = "current_weather")
//@TypeConverters({DescriptionConverter.class})
//@TypeConverters(DescriptionConverter::class)

data class CurrentWeatherEntry(
    val feelslike: Int,
    val humidity: Double,
//    @SerializedName("is_day")
//    val isDay: String,
//    @SerializedName("observation_time")
//    val observationTime: String,
    val precip: Double,
//    val pressure: Double,
    val temperature: Double,
    @SerializedName("uv_index")
    val uvIndex: Double,
    val visibility: Double,
//    @SerializedName("weather_code")
//    val weatherCode: Int,
//
//    @SerializedName("weather_descriptions")
//   // @TypeConverters(DescriptionConverter::class)
//    val weatherDescriptions: Descripition,
//    @SerializedName("weather_icons")
//    val weatherIcons: List<String>,
//    @SerializedName("wind_degree")
//    val windDegree: Double,
    @SerializedName("wind_dir")
    val windDir: String,
     @SerializedName("wind_speed")
    val windSpeed: Int
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}