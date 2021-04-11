package com.enigmacamp.mysimpeldagger.data.dao

import com.enigmacamp.mysimpeldagger.data.model.Trainee

interface TraineeDatabase {

    fun getList() : List<Trainee>

    fun add (newTrainee : Trainee)

    fun getById(id:String) : Trainee

    fun update(trainee : Trainee)

    fun delete(trainee: Trainee)
}