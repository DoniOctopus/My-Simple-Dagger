package com.enigmacamp.mysimpeldagger.di

import android.content.Context
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.di.annotation.AppScope
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@AppScope
@Component(modules = [AppModule::class], dependencies = [DataComponent::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}