package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.anim.AnimActivity
import com.example.myapplication.appbar.AppBarActivity
import com.example.myapplication.bottomsheetdialog.BottomSheetDialogActivity
import com.example.myapplication.customalertdialog.CustomAlertDialogMainActivity
import com.example.myapplication.diffutils.DiffUtilsActivity
import com.example.myapplication.groupie.GroupieActivity
import com.example.myapplication.intro.IntroActivity
import com.example.myapplication.mvvm.ui.auth.LoginActivity
import com.example.myapplication.navigation.NaviMainActivity
import com.example.myapplication.progressbar.ProgressBarActivity
import com.example.myapplication.qrcode.QRCodeActivity
import com.example.myapplication.scratch.ScratchActivity
import com.example.myapplication.splash.SplashActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_navi.setOnClickListener(this)
        btn_scratch.setOnClickListener(this)
        btn_dialog.setOnClickListener(this)
        btn_bottom_dialog.setOnClickListener(this)
        btn_mvvm.setOnClickListener(this)
        btn_qr_code.setOnClickListener(this)
        btn_app_bar.setOnClickListener(this)
        btn_diff_utils.setOnClickListener(this)
        btn_groupie.setOnClickListener(this)
        btn_anim.setOnClickListener(this)
        btn_intro.setOnClickListener(this)
        btn_splash.setOnClickListener(this)
        btn_progressbar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            // 기능 - 네비게이션
            R.id.btn_navi -> {
                val intent = Intent(this, NaviMainActivity::class.java)
                startActivity(intent)
            }

            // 기능 - 스크래치
            R.id.btn_scratch -> {
                val intent = Intent(this, ScratchActivity::class.java)
                startActivity(intent)
            }

            // 기능 - 다이얼로그
            R.id.btn_dialog -> {
                val intent = Intent(this, CustomAlertDialogMainActivity::class.java)
                startActivity(intent)
            }

            // 기능 - 하단 다이얼 로그
            R.id.btn_bottom_dialog -> {
                val intent = Intent(this, BottomSheetDialogActivity::class.java)
                startActivity(intent)
            }

            // 구조 - MVVM
            R.id.btn_mvvm -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            // 기능 - QR Code
            R.id.btn_qr_code -> {
                val intent = Intent(this, QRCodeActivity::class.java)
                startActivity(intent)
            }
            // 화면 - app_bar
            R.id.btn_app_bar -> {
                val intent = Intent(this, AppBarActivity::class.java)
                startActivity(intent)
            }

            // 화면 - DiffUtils
            R.id.btn_diff_utils -> {
                val intent = Intent(this, DiffUtilsActivity::class.java)
                startActivity(intent)
            }

            // 화면 - GroupieLibrary RecyclerView
            R.id.btn_groupie -> {
                val intent = Intent(this, GroupieActivity::class.java)
                startActivity(intent)
            }
            // 애니메이션
            R.id.btn_anim -> {
                val intent = Intent(this, AnimActivity::class.java)
                startActivity(intent)
            }
            // 화면 - Intro Slider Using ViewPager2
            R.id.btn_intro -> {
                val intent = Intent(this, IntroActivity::class.java)
                startActivity(intent)
            }
            // 화면 - Splash
            R.id.btn_splash -> {
                val intent = Intent(this, SplashActivity::class.java)
                startActivity(intent)
            }
            // 화면 - ProgressBar
            R.id.btn_progressbar -> {
                val intent = Intent(this, ProgressBarActivity::class.java)
                startActivity(intent)
            }
        }
    }


}
