package com.enigmacamp.mysimpeldagger

import android.app.Application
import com.enigmacamp.mysimpeldagger.di.AppComponent
import com.enigmacamp.mysimpeldagger.di.DaggerAppComponent

class BaseApplication : Application() {
lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}