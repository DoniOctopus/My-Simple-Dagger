package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.di.annotation.TraineeScope
import dagger.Module
import dagger.Provides

@Module
class MemberModule {
    @Provides
    @TraineeScope
    fun getTitle() = "Mr/Ms"
}