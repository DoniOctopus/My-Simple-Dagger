package com.enigmacamp.mysimpeldagger.di

import android.content.Context
import com.enigmacamp.mysimpeldagger.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityBuilderModule::class, AppModule::class])
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface  Builder {
        @BindsInstance
        fun getApplicationContext(context: Context): Builder

        fun build(): AppComponent
    }
}