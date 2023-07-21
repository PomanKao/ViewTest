package com.example.viewtest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewtest.activitylaunch.TestLaunchActivity
import com.example.viewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLaunchTest.setOnClickListener {
            startActivity(Intent(this, TestLaunchActivity::class.java))
        }
    }
}
