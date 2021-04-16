package com.enigmacamp.mysimpeldagger

import android.app.Activity
import android.app.Application
import com.enigmacamp.mysimpeldagger.di.*
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {
lateinit var appComponent: AppComponent

    override fun  applicationInjector(): AndroidInjector<out DaggerApplication>? {
        appComponent =
            DaggerAppComponent.builder().getApplicationContext(applicationContext).build()
        return appComponent
    }
}