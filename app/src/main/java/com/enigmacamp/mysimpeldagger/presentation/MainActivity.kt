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
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @Named("Basic Trainee")
    lateinit var traineeInfo : TraineeInformation

    @Inject
    @Named("FresGreduate")
    lateinit var fresGreduateInfo : TraineeInformation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)

        //Trainee Information
        Log.d("Trainee",traineeInfo.toString())
        Log.d("Trainee",traineeInfo.getListTrainee().toString())
        Log.d("Trainee",traineeInfo.getCountTrainee().toString())

        //Trainee with FresGreduate Information
        Log.d("Trainee",fresGreduateInfo.toString())
        Log.d("Trainee", fresGreduateInfo.getListTrainee().toString())
        Log.d("Trainee", fresGreduateInfo.getCountTrainee().toString())
    }
}