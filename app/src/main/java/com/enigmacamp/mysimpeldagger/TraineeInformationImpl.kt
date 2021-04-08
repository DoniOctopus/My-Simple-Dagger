package com.enigmacamp.mysimpeldagger

class TraineeInformationImpl(private val traineeDatabase: TraineeDatabase) :
 TraineeInformation {
    override fun getListTrainee() = traineeDatabase.getList()

    override fun getCountTrainee() = traineeDatabase.getList().size
}