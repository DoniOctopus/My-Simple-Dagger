package com.enigmacamp.mysimpeldagger.data.repository

import android.util.Log
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.model.Trainee
import javax.inject.Inject

class FresGreduateInformationImpl @Inject constructor(private val traineeDatabase: TraineeDatabase) : TraineeInformation {
    init {
        Log.d("Database",traineeDatabase.toString())
    }

    override fun getListTrainee(): List<Trainee> {
        return traineeDatabase.getList().filter {
            it.isFressGreduate
        }
    }

    override fun getCountTrainee(): Int {
        return getListTrainee().size
    }

    override fun registerTrainee(trainee: Trainee) {
        val newFresGreduateMember = trainee.copy(isFressGreduate = true)
        traineeDatabase.update(newFresGreduateMember)
    }

    override fun unregisterTrainee(trainee: Trainee) {
        val newFresGreduateMember = trainee.copy(isFressGreduate = true)
        traineeDatabase.update(newFresGreduateMember)
    }

}