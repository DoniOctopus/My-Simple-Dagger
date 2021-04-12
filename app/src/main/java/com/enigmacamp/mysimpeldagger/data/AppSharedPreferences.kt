package com.enigmacamp.mysimpeldagger.data

import android.content.SharedPreferences

class AppSharedPreferences(private val sharedPreferences: SharedPreferences) {
    fun add(key : String, value : String){
    sharedPreferences.edit().putString(key,value).commit()
    }
    fun get(key : String) = sharedPreferences.getString(key,"")
}
