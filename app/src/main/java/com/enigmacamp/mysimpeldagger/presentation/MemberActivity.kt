package com.enigmacamp.mysimpeldagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mysimpeldagger.data.AppSharedPreferences
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.databinding.ActivityMemberBinding
import com.enigmacamp.mysimpeldagger.di.DaggerMemberComponent
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MemberActivity : DaggerAppCompatActivity() {

    @Inject
    @TraineeMember
    lateinit var traineeInformation: TraineeInformation

    @Inject
    @FresGreduateMember
    lateinit var fresGreduateInformation : TraineeInformation

    @Inject
    lateinit var title : String

    @Inject
    lateinit var appSharedPreferences: AppSharedPreferences

    private lateinit var  viewBinding: ActivityMemberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMemberBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

//        DaggerMemberComponent.builder().dataComponent(data.provideDataComponent())
//            .build().inject(this)

        Log.d("SharedPref", appSharedPreferences.get("token").toString())
        Log.d("SharedPref", appSharedPreferences.toString())
        Log.d("Trainee", traineeInformation.toString())
//        Log.d("Trainee", traineeInformation.getListTrainee().toString())
//        Log.d("Trainee", traineeInformation.getCountTrainee().toString())

        Log.d("Trainee", fresGreduateInformation.toString())
//        Log.d("Trainee", fresGreduateInformation.getListTrainee().toString())
//        Log.d("Trainee", fresGreduateInformation.getCountTrainee().toString())

        Log.d("CustomerTitle",title)

    }
}