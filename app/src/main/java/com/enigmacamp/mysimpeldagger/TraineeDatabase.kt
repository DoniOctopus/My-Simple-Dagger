package com.enigmacamp.mysimpeldagger

interface TraineeDatabase {

    fun getList() : List<Trainee>

    fun add (newTrainee : Trainee)

    fun getById(id:String) : Trainee
}