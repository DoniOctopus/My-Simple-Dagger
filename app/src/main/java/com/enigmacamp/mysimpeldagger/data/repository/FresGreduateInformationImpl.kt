package com.enigmacamp.mysimpeldagger.data.repository

import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.model.Trainee
import javax.inject.Inject

class FresGreduateInformationImpl @Inject constructor(private val traineeDatabase: TraineeDatabase) : TraineeInformation {
    override fun getListTrainee(): List<Trainee> {
        return traineeDatabase.getList().filter {
            it.isFressGreduate
        }
    }

    override fun getCountTrainee(): Int {
        return getListTrainee().size
    }

}