package com.enigmacamp.mysimpeldagger.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import com.enigmacamp.mysimpeldagger.*
import com.enigmacamp.mysimpeldagger.data.model.Trainee
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.databinding.ActivityMainBinding
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

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.apply {
            traineeButton.setOnClickListener {
                startActivity(Intent(this@MainActivity,MemberActivity::class.java))
            }
        }

        DaggerAppComponent.builder().build().inject(this)

        //create mew trainee
        val newTrainee = Trainee("6","maul","20",true)
        traineeInfo.registerTrainee(newTrainee)

        val newTrainee2 = Trainee("7","daniel","23")
        traineeInfo.registerTrainee(newTrainee2)
        fresGreduateInfo.registerTrainee(newTrainee2)

        //unregister member trainee
        fresGreduateInfo.unregisterTrainee(newTrainee)

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