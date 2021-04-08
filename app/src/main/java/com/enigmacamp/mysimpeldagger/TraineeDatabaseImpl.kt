package com.enigmacamp.mysimpeldagger

class TraineeDatabaseImpl: TraineeDatabase {

    private  var traineeData = arrayListOf(
        Trainee("1","Doni","23")
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