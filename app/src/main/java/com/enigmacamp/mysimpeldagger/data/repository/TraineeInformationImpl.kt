package com.enigmacamp.mysimpeldagger.data.repository

import android.util.Log
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabase
import com.enigmacamp.mysimpeldagger.data.model.Trainee
import javax.inject.Inject

class TraineeInformationImpl  @Inject constructor(private val traineeDatabase: TraineeDatabase) :
        TraineeInformation {
    init {
        Log.d("Database",traineeDatabase.toString())
    }

    override fun getListTrainee() = traineeDatabase.getList()

    override fun getCountTrainee() = traineeDatabase.getList().size
    override fun registerTrainee(trainee: Trainee) {
        traineeDatabase.add(trainee)
    }

    override fun unregisterTrainee(trainee: Trainee) {
        traineeDatabase.delete(trainee)
    }
}