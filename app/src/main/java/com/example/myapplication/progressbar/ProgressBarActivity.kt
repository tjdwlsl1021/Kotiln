package com.example.myapplication.progressbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {

    private var progr = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

        updateProgressBar()

        button_incr.setOnClickListener {
            if (progr <= 90) {
                progr += 10
                updateProgressBar();
            }
        }

        button_decr.setOnClickListener {
            if (progr >= 10) {
                progr -= 10
            }
            updateProgressBar()
        }
    }

    private fun updateProgressBar() {
        progress_bar.progress = progr
        text_view_progress.text = "$progr%"
    }
}
