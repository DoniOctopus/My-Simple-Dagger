package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.di.annotation.TraineeScope
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Component
import dagger.Subcomponent

@TraineeScope
@Component(
    modules = [MemberModule::class],
    dependencies = [AppComponent::class]
)
interface MemberComponent{
    fun inject(memberActivity: MemberActivity)
}