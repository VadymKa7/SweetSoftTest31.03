package com.vadym.sweetsofttest3103.di

import android.content.Context
import com.vadym.sweetsofttest3103.AndroidApplication
import com.vadym.sweetsofttest3103.di.modules.ActivitiesModule
import com.vadym.sweetsofttest3103.di.modules.AppModule
import com.vadym.sweetsofttest3103.di.modules.ImplModule
import com.vadym.sweetsofttest3103.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivitiesModule::class,
    ViewModelModule::class,
    ImplModule::class
])

interface AppComponent {

    fun inject(app: AndroidApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

}
