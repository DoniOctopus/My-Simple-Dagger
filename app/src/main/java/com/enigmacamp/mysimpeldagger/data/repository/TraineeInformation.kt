package com.enigmacamp.mysimpeldagger.data.repository

import com.enigmacamp.mysimpeldagger.data.model.Trainee

interface TraineeInformation {
    fun getListTrainee():List<Trainee>

    fun getCountTrainee():Int
}