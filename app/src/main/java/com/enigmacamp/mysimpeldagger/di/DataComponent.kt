package com.enigmacamp.mysimpeldagger.di

import android.content.Context
import com.enigmacamp.mysimpeldagger.data.AppSharedPreferences
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface DataComponent {
    @TraineeMember
    fun getTraineeInfo():TraineeInformation

    @FresGreduateMember
    fun getFresGreduateInfo(): TraineeInformation

    fun getAppSharedPreferences():AppSharedPreferences

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun getApplicationContext(context: Context) : Builder
        fun build(): DataComponent
    }
}