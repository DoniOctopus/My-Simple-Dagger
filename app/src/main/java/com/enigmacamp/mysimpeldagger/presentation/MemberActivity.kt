package com.enigmacamp.mysimpeldagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.enigmacamp.mysimpeldagger.R
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.databinding.ActivityMemberBinding
import com.enigmacamp.mysimpeldagger.di.DaggerAppComponent
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import javax.inject.Inject

class MemberActivity : AppCompatActivity() {

    @Inject
    @TraineeMember
    lateinit var traineeInformation: TraineeInformation

    @Inject
    @FresGreduateMember
    lateinit var fresGreduateInformation : TraineeInformation

    private lateinit var  viewBinding: ActivityMemberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMemberBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        DaggerAppComponent.builder().build().injectMemberActivity(this)
        Log.d("Trainee", traineeInformation.toString())
        Log.d("Trainee", traineeInformation.getListTrainee().toString())
        Log.d("Trainee", traineeInformation.getCountTrainee().toString())

        Log.d("Trainee", fresGreduateInformation.toString())
        Log.d("Trainee", fresGreduateInformation.getListTrainee().toString())
        Log.d("Trainee", fresGreduateInformation.getCountTrainee().toString())

    }
}