package com.enigmacamp.mysimpeldagger

import android.app.Activity
import android.app.Application
import com.enigmacamp.mysimpeldagger.di.AppComponent
import com.enigmacamp.mysimpeldagger.di.DaggerAppComponent

class BaseApplication : Application() {
lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent =
            DaggerAppComponent.builder().getApplicationContext(applicationContext).build()
    }
}

val Activity.app: BaseApplication
    get() {
        return application as BaseApplication
    }
