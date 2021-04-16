package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.di.annotation.ActivityScope
import com.enigmacamp.mysimpeldagger.di.annotation.TraineeScope
import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [MemberModule::class])
    abstract fun contributeMemberActivity() : MemberActivity
}