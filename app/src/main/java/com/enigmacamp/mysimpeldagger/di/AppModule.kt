package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabaseImpl
import com.enigmacamp.mysimpeldagger.data.repository.FresGreduateInformationImpl
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformationImpl
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class AppModule {

    @Binds
    abstract fun bindTraineeDatabase(traineeDatabaseImpl: TraineeDatabaseImpl): TraineeDatabase

    @Binds
    @TraineeMember
    abstract fun bindTraineeInformation(traineeInformationImpl: TraineeInformationImpl) : TraineeInformation

    @Binds
    @FresGreduateMember
    abstract fun bindFresGreduateInformation(fresGreduateInformationImpl: FresGreduateInformationImpl) : TraineeInformation
}