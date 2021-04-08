package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import dagger.Component


@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}