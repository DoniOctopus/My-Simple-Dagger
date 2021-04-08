package com.enigmacamp.mysimpeldagger

class FresGreduateInformationImpl(private val traineeDatabase: TraineeDatabase) : TraineeInformation {
    override fun getListTrainee(): List<Trainee> {
        return traineeDatabase.getList().filter {
            it.isFressGreduate
        }
    }

    override fun getCountTrainee(): Int {
        return getListTrainee().size
    }

}