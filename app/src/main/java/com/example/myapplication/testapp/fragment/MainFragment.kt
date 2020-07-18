package com.example.myapplication.testapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    lateinit var navController: NavController // 선언할 때 초기화 하는게 아니라 onViewCreated여기에서 초기화 할거라서 컴파일러에게 lateinit할거라고 알려준다

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { // 뷰가 만들어지고 나서 호출하는 함수
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_next.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }

}
