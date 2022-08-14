package com.example.app_base

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {


    protected fun startActivity(className: String, bundle: Bundle? = null) {
        try {
            val clazz = Class.forName(className)
            val intent = Intent(this, clazz)
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        } catch (e: ClassNotFoundException) {
            Toast.makeText(this, "找不到${e.message}", Toast.LENGTH_SHORT).show()
        }
    }


}