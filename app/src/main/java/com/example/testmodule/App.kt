package com.example.testmodule

import android.app.Application
import com.example.app_base.ModuleMediator

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        ModuleMediator.init(this)
    }

}