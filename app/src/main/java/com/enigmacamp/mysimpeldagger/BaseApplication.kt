package com.enigmacamp.mysimpeldagger

import android.app.Activity
import android.app.Application
import com.enigmacamp.mysimpeldagger.di.*

class BaseApplication : Application(), DataComponentProvide {
lateinit var appComponent: AppComponent
private lateinit var dataComponent: DataComponent

    override fun onCreate() {
        super.onCreate()
        dataComponent =
            DaggerDataComponent.builder().getApplicationContext(applicationContext).build()
            appComponent = DaggerAppComponent.builder().dataComponent(dataComponent).build()
    }

    override fun provideDataComponent()= dataComponent
}

val Activity.app: BaseApplication
    get() {
        return application as BaseApplication
    }
val Activity.data: DataComponentProvide
    get() {
        return application as DataComponentProvide
    }

