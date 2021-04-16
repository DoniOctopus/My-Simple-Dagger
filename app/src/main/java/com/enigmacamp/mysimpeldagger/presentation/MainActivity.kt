package com.enigmacamp.mysimpeldagger.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mysimpeldagger.*
import com.enigmacamp.mysimpeldagger.data.AppSharedPreferences
import com.enigmacamp.mysimpeldagger.data.model.Trainee
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.databinding.ActivityMainBinding
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    @TraineeMember
    lateinit var traineeInfo : TraineeInformation

    @Inject
    @FresGreduateMember
    lateinit var fresGreduateInfo : TraineeInformation

    private lateinit var viewBinding: ActivityMainBinding

    @Inject
    lateinit var appSharedPreferences: AppSharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.apply {
            traineeButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MemberActivity::class.java))
            }
        }

//       app.appComponent.inject(this)

        //create mew trainee
        val newTrainee = Trainee("6","maul","20",true)
        traineeInfo.registerTrainee(newTrainee)

        val newTrainee2 = Trainee("7","daniel","23")
        traineeInfo.registerTrainee(newTrainee2)
//        fresGreduateInfo.registerTrainee(newTrainee2)
//        fresGreduateInfo.unregisterTrainee(newTrainee)

        appSharedPreferences.add("token","123")
        Log.d("SharedPref",appSharedPreferences.toString())

        //Trainee Information
        Log.d("Trainee",traineeInfo.toString())
//        Log.d("Trainee",traineeInfo.getListTrainee().toString())
//        Log.d("Trainee",traineeInfo.getCountTrainee().toString())

        //Trainee with FresGreduate Information
        Log.d("Trainee",fresGreduateInfo.toString())
//        Log.d("Trainee", fresGreduateInfo.getListTrainee().toString())
//        Log.d("Trainee", fresGreduateInfo.getCountTrainee().toString())
    }
}