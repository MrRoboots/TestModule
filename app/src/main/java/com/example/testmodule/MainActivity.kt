package com.example.testmodule

import android.os.Bundle
import android.widget.Button
import com.example.app_base.BaseActivity
import com.example.app_base.ModuleMediator

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_setting).setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_SETTING_CLASS)
        }

        findViewById<Button>(R.id.btn_video).setOnClickListener {
            startActivity(ModuleMediator.ACTIVITY_VIDEO_CLASS)
        }
    }
}