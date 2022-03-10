package com.tech.world.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tech.world.R

class LoggedOutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged_out)
    }
}