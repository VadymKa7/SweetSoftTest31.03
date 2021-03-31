package com.vadym.sweetsofttest3103.ui

import androidx.lifecycle.ViewModel
import com.vadym.sweetsofttest3103.data.DataRepository
import javax.inject.Inject
import kotlin.properties.Delegates

class MainViewModel @Inject constructor(private val newsRepository: DataRepository) : ViewModel()  {
    var idName by Delegates.notNull<String>()


    val newsList by lazy() {
        newsRepository.getWeatherList(idName)
    }

}