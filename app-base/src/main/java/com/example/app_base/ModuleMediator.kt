package com.example.app_base

import android.app.Application

/**
 * 此类可以放到base模块中 此处只做演示
 */
object ModuleMediator {
    const val ACTIVITY_SETTING_CLASS = "com.example.app_setting.SettingActivity"
    const val ACTIVITY_VIDEO_CLASS = "com.example.app_video.VideoActivity"

    private const val APP_SETTING_CLASS = "com.example.app_setting.App"
    private const val APP_VIDEO_CLASS = "com.example.app_video.App"

    interface AppInitial {
        fun init(app: Application)
    }

    /**
     * 反射各个模块初始化代码
     */
    fun init(app: Application) {
        val appClass = arrayOf(
            APP_SETTING_CLASS,
            APP_VIDEO_CLASS
        )

        for (clazz in appClass) {
            try {
                val clz = Class.forName(clazz)
                val obj = clz.newInstance() as AppInitial
                obj.init(app)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }

    }

}