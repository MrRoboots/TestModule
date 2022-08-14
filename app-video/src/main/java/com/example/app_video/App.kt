package com.example.app_video

import android.app.Application
import android.util.Log
import com.example.app_base.ModuleMediator

class App : ModuleMediator.AppInitial {

    companion object {
        val TAG = App::class.simpleName
    }

    override fun init(app: Application) {
        Log.e(TAG, "video app init")
    }
}