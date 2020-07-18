package com.example.myapplication.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_navi_main.*


class NaviMainActivity : AppCompatActivity() {

    lateinit var navControllor: NavController // 지금 초기화 할게 아니라 나중에 초기화 할거라서 lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navi_main)

        navControllor = nav_host_fragment.findNavController() // 코틀린에서는 바로 id를 써주면 된다.
    }
}
