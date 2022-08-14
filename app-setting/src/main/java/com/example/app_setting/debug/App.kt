package com.example.app_setting.debug

import android.app.Application
import com.example.app_setting.App

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        App().init(this)
    }

}