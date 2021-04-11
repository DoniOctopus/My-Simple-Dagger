package com.enigmacamp.mysimpeldagger.di

import com.enigmacamp.mysimpeldagger.presentation.MainActivity
import com.enigmacamp.mysimpeldagger.presentation.MemberActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)

    fun injectMemberActivity(memberActivity: MemberActivity)
}