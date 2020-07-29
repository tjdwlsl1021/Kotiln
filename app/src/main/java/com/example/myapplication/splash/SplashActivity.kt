package com.example.myapplication.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.main.MainActivity

class SplashActivity : AppCompatActivity() {

    private val handler: Handler by lazy {
        Handler()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    private val runnable = Runnable {
        if (!isFinishing) {
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(runnable, 1000)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }
}
