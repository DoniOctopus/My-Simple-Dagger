package com.enigmacamp.mysimpeldagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var traineeInfo : TraineeInformation
    private lateinit var fresGreduateInfo : TraineeInformation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val traineeDatabase = TraineeDatabaseImpl()
        traineeInfo = TraineeInformationImpl(traineeDatabase)
        Log.d("Trainee",traineeInfo.getListTrainee().toString())
        Log.d("Trainee",traineeInfo.getCountTrainee().toString())

        fresGreduateInfo = FresGreduateInformationImpl(traineeDatabase)
        Log.d("Trainee", fresGreduateInfo.getListTrainee().toString())
        Log.d("Trainee", fresGreduateInfo.getCountTrainee().toString())
    }
}