package com.example.myapplication.base

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.customalertdialog.CustomAlertDialogMainActivity
import com.example.myapplication.navigation.NaviMainActivity
import com.example.myapplication.scratch.ScratchActivity
import kotlinx.android.synthetic.main.activity_main.*

// 예제별 버튼만들어서 클릭하면 해당 페이지 이동
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_navi.setOnClickListener(this)
        btn_scratch.setOnClickListener(this)
        btn_dialog.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_navi -> {
                val intent = Intent(this, NaviMainActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_scratch -> {
                val intent = Intent(this, ScratchActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_dialog -> {
                val intent = Intent(this, CustomAlertDialogMainActivity::class.java)
                startActivity(intent)
            }
        }
    }


}
