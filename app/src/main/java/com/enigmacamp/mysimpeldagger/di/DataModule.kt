package com.enigmacamp.mysimpeldagger.di

import android.content.Context
import com.enigmacamp.mysimpeldagger.data.AppSharedPreferences
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabaseImpl
import com.enigmacamp.mysimpeldagger.data.repository.FresGreduateInformationImpl
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformationImpl
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class DataModule {
    @Singleton
    @Binds
    abstract fun bindTraineeDatabase(traineeDatabaseImpl: TraineeDatabaseImpl): TraineeDatabase

    @Singleton
    @Binds
    @TraineeMember
    abstract fun bindTraineeInformation(traineeInformationImpl: TraineeInformationImpl) : TraineeInformation

    @Singleton
    @Binds
    @FresGreduateMember
    abstract fun bindFresGreduateInformation(fresGreduateInformationImpl: FresGreduateInformationImpl) : TraineeInformation

    companion object{
        private const val PREF_NAME = "TRAINEE_SHARED_PREF"
        var PRIVATE_MODE = 0

        @Singleton
        @Provides
        fun provideSharedPreferences(context: Context): AppSharedPreferences {
            val sharedPref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
            return AppSharedPreferences(sharedPref)
        }
    }
}