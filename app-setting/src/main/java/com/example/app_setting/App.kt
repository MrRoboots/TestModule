package com.example.app_setting

import android.app.Application
import android.util.Log
import com.example.app_base.ModuleMediator
import com.example.app_setting.debug.App

class App : ModuleMediator.AppInitial {

    companion object {
        val TAG = App::class.simpleName
    }

    override fun init(app: Application) {
        Log.e(TAG, "setting app init")
    }

}