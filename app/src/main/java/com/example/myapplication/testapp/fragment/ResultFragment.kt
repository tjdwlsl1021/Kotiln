package com.example.myapplication.testapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//         Inflate the layout for this fragment

//        option = arguments?.getInt("index") // arguments값이 null이면 getInt한 값도 null이라서 빨간색 줄이 생긴다
        option = arguments?.getInt("index") ?: -1 //엘비스 연산자 - 전체가 null이면 -1을 반환

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)

        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    private fun setResult(option: Int) {
        when (option) {
            1 -> {
                tv_main.text = "text1"
                tv_sub.text = "sub text1"
            }
            2 -> {
                tv_main.text = "text2"
                tv_sub.text = "sub text2"
            }
            3 -> {
                tv_main.text = "text3"
                tv_sub.text = "sub text3"
            }
            4 -> {
                tv_main.text = "text4"
                tv_sub.text = "sub text4"
            }

        }
    }

}
