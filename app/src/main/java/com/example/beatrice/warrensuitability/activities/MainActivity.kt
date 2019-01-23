package com.example.beatrice.warrensuitability.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.beatrice.warrensuitability.R
import com.example.beatrice.warrensuitability.services.WarrenSuitabilityServices

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WarrenSuitabilityServices().postMessage(this)
    }
    
}
