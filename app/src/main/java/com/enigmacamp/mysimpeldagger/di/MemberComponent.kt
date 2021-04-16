package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.di.annotation.TraineeScope
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Component
import dagger.Subcomponent


@Subcomponent
interface MemberComponent{
    @Subcomponent.Builder
    interface Builder{
        fun build(): MemberComponent
    }
}