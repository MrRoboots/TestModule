package com.example.app_video.debug

import android.app.Application
import com.example.app_video.App

/**
 * debug模式 该模块可以独立运行
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        App().init(this)
    }

}