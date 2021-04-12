package com.enigmacamp.mysimpeldagger.di

import android.content.Context
import com.enigmacamp.mysimpeldagger.data.repository.TraineeInformation
import com.enigmacamp.mysimpeldagger.di.annotation.FresGreduateMember
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeMember
import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun getApplicationContext(context: Context) : Builder

        fun build():AppComponent
    }

    val getTrainerComponentBuilder : MemberComponent.Builder
}