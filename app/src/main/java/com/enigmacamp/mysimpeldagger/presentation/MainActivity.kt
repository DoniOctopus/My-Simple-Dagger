package com.enigmacamp.mysimpeldagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mysimpeldagger.*
import com.enigmacamp.mysimpeldagger.data.dao.TraineeDatabaseImpl
import com.enigmacamp.mysimpeldagger.data.repository.FresGreduateInformationImpl
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformationImpl
import com.enigmacamp.mysimpeldagger.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var traineeInfo : TraineeInformation
//    private lateinit var fresGreduateInfo : TraineeInformation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        Log.d("Trainee",traineeInfo.getListTrainee().toString())
        Log.d("Trainee",traineeInfo.getCountTrainee().toString())

//        fresGreduateInfo = FresGreduateInformationImpl(traineeDatabase)
//        Log.d("Trainee", fresGreduateInfo.getListTrainee().toString())
//        Log.d("Trainee", fresGreduateInfo.getCountTrainee().toString())
    }
}