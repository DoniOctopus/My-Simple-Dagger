package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Subcomponent

@Subcomponent(modules = [MemberModule::class])
interface MemberComponent{
    fun inject(memberActivity: MemberActivity)

    @Subcomponent.Builder
    interface Builder{
        fun build() : MemberComponent
    }
}