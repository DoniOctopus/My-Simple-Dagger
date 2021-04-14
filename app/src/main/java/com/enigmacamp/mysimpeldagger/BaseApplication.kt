package com.enigmacamp.mysimpeldagger

import android.app.Activity
import android.app.Application
import com.enigmacamp.mysimpeldagger.di.*
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication(), DataComponentProvide {
lateinit var appComponent: AppComponent
private lateinit var dataComponent: DataComponent

    override fun  applicationInjector(): AndroidInjector<out DaggerApplication>? {
        dataComponent =
            DaggerDataComponent.builder().getApplicationContext(applicationContext).build()
            appComponent = DaggerAppComponent.builder().dataComponent(dataComponent).build()
        return appComponent
    }

    override fun provideDataComponent()= dataComponent
}