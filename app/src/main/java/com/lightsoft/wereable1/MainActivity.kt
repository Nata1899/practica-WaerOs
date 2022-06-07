package com.lightsoft.wereable1


import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class MainActivity : WearableActivity() {


    private lateinit var binding: WearableActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
    }
}