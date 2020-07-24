package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.appbar.AppBarActivity
import com.example.myapplication.bottomsheetdialog.BottomSheetDialogActivity
import com.example.myapplication.customalertdialog.CustomAlertDialogMainActivity
import com.example.myapplication.mvvm.ui.auth.LoginActivity
import com.example.myapplication.navigation.NaviMainActivity
import com.example.myapplication.qrcode.QRCodeActivity
import com.example.myapplication.scratch.ScratchActivity
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
        }
    }


}
