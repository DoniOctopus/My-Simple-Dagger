package com.enigmacamp.mysimpeldagger

class TraineeDatabase {
    private var traineeData = arrayListOf(
            Trainee("1", "Doni","23")
    )

    fun getList() = traineeData

    fun add(newTrainee: Trainee) {
        traineeData.add(newTrainee)
    }

    fun getById(id: String): Trainee {
        val traineeFilter = traineeData.filter {
            it.traineeID == id
        }
        return traineeFilter.first()
    }
}