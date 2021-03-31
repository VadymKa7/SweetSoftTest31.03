package com.vadym.sweetsofttest3103.di.modules

import com.vadym.sweetsofttest3103.ui.MainActivity
import com.vadym.sweetsofttest3103.ui.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivitiesModule {

    @ContributesAndroidInjector
    fun splashActivityInjector(): SplashActivity

    @ContributesAndroidInjector
    fun mainActivityInjector(): MainActivity
}