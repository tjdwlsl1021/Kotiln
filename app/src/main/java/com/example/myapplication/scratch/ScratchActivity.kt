package com.example.myapplication.scratch

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anupkumarpanwar.scratchview.ScratchView
import com.example.myapplication.R

class ScratchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scratch)

        val scratchView = findViewById<ScratchView>(R.id.scratchView)
        scratchView.setRevealListener(object : ScratchView.IRevealListener {
            override fun onRevealed(scratchView: ScratchView?) {
                Toast.makeText(applicationContext, "Reveled", Toast.LENGTH_SHORT).show()
            }

            override fun onRevealPercentChangedListener(scratchView: ScratchView?, percent: Float) {
                Log.d("scratch", percent.toString())
            }
        })
    }
}
