package com.zss.xlog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tencent.mars.xlog.Log
import com.zss.L

class MainActivty: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        L.config(this).setConsoleSwitch(BuildConfig.DEBUG).build()
        L.d(Log.getSysInfo())
        L.d("Hello world")
        L.d("Test","Hello World")
        L.json("{\"code\": 0, \"msg\": \"success\", \"data\": {\"list\": [], \"next_page\": false,  \"unread\": 0}}")
    }
}