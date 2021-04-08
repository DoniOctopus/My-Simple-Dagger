package com.enigmacamp.mysimpeldagger.data.dao

import com.enigmacamp.mysimpeldagger.data.model.Trainee
import javax.inject.Inject

class TraineeDatabaseImpl @Inject constructor(): TraineeDatabase {

    private  var traineeData = arrayListOf(
        Trainee("1","Doni","23",true),
        Trainee("2","Edo","25",true),
        Trainee("3","Tika","20",true),
        Trainee("4","Egi","25"),
        Trainee("5","Reja","25"),

    )

    override fun getList() = traineeData

    override fun add(newTrainee: Trainee) {
        traineeData.add(newTrainee)
    }

    override fun getById(id: String): Trainee {
        val traineeFilter = traineeData.filter {
            it.traineeID == id
        }
        return traineeFilter.first()
    }
}