package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

    @TraineeMember
    fun getTraineeInfo() : TraineeInformation

    @FresGreduateMember
    fun getFresGreduateInfo() : TraineeInformation
}