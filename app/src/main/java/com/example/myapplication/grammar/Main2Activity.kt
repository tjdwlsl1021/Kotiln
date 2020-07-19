package com.example.myapplication.grammar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() { // 동영상 보고 따라치기 - kotlin grammar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                // to do..
            }
        })

        // 1. Kotlin interface가 아닌 자바 인터페이스여야 한다.
        // -> setOnClickListener 클릭해서 자바 인터페이스인지 확인한다.  void가 있다

        // 2. 그 인터페이스는 딱 하나의 메소드만 가져야한다.
        // -> 단 하나의 메소스만 있다 void onClick(View var1)

        // 익명 내부 함수, 아래처럼 간단하게 표시할 수 있다는게 장점인가봄
        button.setOnClickListener {
            // to do... 위에랑 똑같은걸 한다.
        }
    }
}
