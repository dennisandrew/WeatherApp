package com.dennisandrew.weatherapp.domain.repository

import com.dennisandrew.weatherapp.domain.util.Resource
import com.dennisandrew.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}