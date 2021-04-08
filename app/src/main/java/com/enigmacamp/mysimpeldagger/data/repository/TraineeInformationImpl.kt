package com.enigmacamp.mysimpeldagger.data.repository

import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import javax.inject.Inject

class TraineeInformationImpl  @Inject constructor(private val traineeDatabase: TraineeDatabase) :
        TraineeInformation {
    override fun getListTrainee() = traineeDatabase.getList()

    override fun getCountTrainee() = traineeDatabase.getList().size
}