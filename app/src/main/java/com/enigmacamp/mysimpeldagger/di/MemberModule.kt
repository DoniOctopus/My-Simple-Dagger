package com.enigmacamp.mysimpeldagger.di

import dagger.Module
import dagger.Provides

@Module
class MemberModule {
    @Provides
    fun provideTitle() = "Mr/Ms"
}