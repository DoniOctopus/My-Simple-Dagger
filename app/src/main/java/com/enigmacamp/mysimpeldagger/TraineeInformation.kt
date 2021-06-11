package com.enigmacamp.mysimpeldagger

class TraineeInformation {
    private val traineeDatabase = TraineeDatabase()

    fun getListCustomer() = traineeDatabase.getList()

    fun getCountCustomer() = traineeDatabase.getList().size
}