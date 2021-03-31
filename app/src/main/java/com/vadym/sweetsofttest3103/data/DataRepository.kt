package com.vadym.sweetsofttest3103.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.vadym.sweetsofttest3103.api.AppService
import com.vadym.sweetsofttest3103.model.Weather
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataRepository  @Inject constructor(private val service: AppService){

    fun getWeatherList (id: String): LiveData<List<Weather>> {
        return liveData(Dispatchers.IO) {
            try {
                val newsList = service.getNewsList(id)
                emit(newsList)
            }catch (er: Exception){
                er.printStackTrace()
            }
        }
    }
}