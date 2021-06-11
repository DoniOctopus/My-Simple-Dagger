package com.enigmacamp.mysimpeldagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val traineeInformation: TraineeInformation = TraineeInformation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Trainee", traineeInformation.getListCustomer().toString())
        Log.d("Trainee", traineeInformation.getCountCustomer().toString())
    }
}