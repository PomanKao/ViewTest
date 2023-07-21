package com.example.viewtest.activitylaunch

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.viewtest.databinding.ActivityTestLauchBinding

class TestLaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTestLauchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = baseContext.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (appTask in manager.appTasks) {
            Log.d(javaClass.simpleName, "class name: ${appTask.taskInfo.topActivity?.className}")
        }

        binding.tvActivityName.text = "Test "

        binding.btnLaunchStandard.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }
        binding.btnLaunchSingleTop.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }
        binding.btnLaunchSingleTask.setOnClickListener {
            startActivity(Intent(this, SingleTaskActivity::class.java))
        }
        binding.btnLaunchSingleInstance.setOnClickListener {
            startActivity(Intent(this, SingleInstanceActivity::class.java))
        }
    }
}