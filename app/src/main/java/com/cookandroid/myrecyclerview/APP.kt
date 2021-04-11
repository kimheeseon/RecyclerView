package com.cookandroid.myrecyclerview

import android.app.Application

class APP:Application() {
    companion object{
        lateinit var instance: APP
            private set
    }

    override fun onCreate(){
        super.onCreate()
        instance = this
    }
}