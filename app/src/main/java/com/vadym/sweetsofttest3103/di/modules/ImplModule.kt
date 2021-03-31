package com.vadym.sweetsofttest3103.di.modules

import androidx.lifecycle.ViewModelProvider
import com.vadym.sweetsofttest3103.di.impl.ViewModelFactoryImpl
import dagger.Binds
import dagger.Module

@Module
interface ImplModule {
    @Binds fun bindViewModelFactory(factory: ViewModelFactoryImpl): ViewModelProvider.Factory
}
