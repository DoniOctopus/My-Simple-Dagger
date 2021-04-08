package com.enigmacamp.mysimpeldagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mysimpeldagger.*
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.di.DaggerAppComponent
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    @TraineeMember
    lateinit var traineeInfo : TraineeInformation

    @Inject
    @FresGreduateMember
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