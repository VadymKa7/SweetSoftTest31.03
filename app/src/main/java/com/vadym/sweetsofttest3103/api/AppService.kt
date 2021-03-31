package com.vadym.sweetsofttest3103.api

import com.vadym.sweetsofttest3103.model.Weather
import retrofit2.http.GET
import retrofit2.http.Query


interface AppService {
    companion object {
        const val ENDPOINT = "https://www.metaweather.com/"
    }

    @GET("/api/location/search/")
    suspend fun   getNewsList(@Query("query") page: String? = null) : List<Weather>

}