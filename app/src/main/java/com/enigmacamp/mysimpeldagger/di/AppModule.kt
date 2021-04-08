package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabaseImpl
import com.enigmacamp.mysimpeldagger.data.repository.FresGreduateInformationImpl
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformationImpl
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class AppModule {

    @Binds
    abstract fun bindTraineeDatabase(traineeDatabaseImpl: TraineeDatabaseImpl): TraineeDatabase

    @Binds
    @Named("Basic Trainee")
    abstract fun bindTraineeInformation(traineeInformationImpl: TraineeInformationImpl) : TraineeInformation

    @Binds
    @Named("FresGreduate")
    abstract fun bindFresGreduateInformation(fresGreduateInformationImpl: FresGreduateInformationImpl) : TraineeInformation
}