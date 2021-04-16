package com.enigmacamp.mysimpeldagger.di


import dagger.Module

@Module(subcomponents = [MemberComponent::class], includes = [DataModule::class])
abstract class AppModule {

}