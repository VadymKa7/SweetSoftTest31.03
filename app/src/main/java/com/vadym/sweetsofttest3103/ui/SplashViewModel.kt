package com.vadym.sweetsofttest3103.ui

import androidx.lifecycle.*
import kotlinx.coroutines.*
import javax.inject.Inject

class SplashViewModel @Inject constructor() : ViewModel() {
    val liveData: LiveData<SplashState> get() = mutableLiveData
    private val mutableLiveData = MutableLiveData<SplashState>()


    init {
        GlobalScope.launch {
            delay(3000)
            mutableLiveData.postValue(SplashState.MainActivity)
        }
    }
}
sealed class SplashState {
    object MainActivity : SplashState()
}
