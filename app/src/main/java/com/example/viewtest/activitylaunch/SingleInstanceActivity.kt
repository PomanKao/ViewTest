package com.example.viewtest.activitylaunch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewtest.databinding.ActivityTestLauchBinding

class SingleInstanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTestLauchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvActivityName.text = SingleInstanceActivity::class.java.simpleName

        binding.btnLaunchStandard.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }
        binding.btnLaunchSingleTop.setOnClickListener {
            startActivity(Intent(this, SingleInstanceActivity::class.java))
        }
        binding.btnLaunchSingleTask.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }
        binding.btnLaunchSingleInstance.setOnClickListener {
            startActivity(Intent(this, SingleInstanceActivity::class.java))
        }
    }
}