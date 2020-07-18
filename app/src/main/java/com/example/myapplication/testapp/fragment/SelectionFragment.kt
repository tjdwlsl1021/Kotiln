package com.example.myapplication.testapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_selection.*

/**
 * A simple [Fragment] subclass.
 */
class SelectionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        btn_back.setOnClickListener(this)
        option_1.setOnClickListener(this)
        option_2.setOnClickListener(this)
        option_3.setOnClickListener(this)
        option_4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // fragment는 항상 Back stact에 쌓인다.
        when (v?.id) {
            R.id.option_1 -> {
                navigateWithIndex(1)
            }
            R.id.option_2 -> {
                navigateWithIndex(2)
            }
            R.id.option_3 -> {
                navigateWithIndex(3)
            }
            R.id.option_4 -> {
                navigateWithIndex(4)
            }
            R.id.btn_back -> {
                navController.popBackStack()
            }
        }
    }

    fun navigateWithIndex(index: Int) {
        val bundle =
            bundleOf("index" to index) // key와 value로 보낼건데, key는 index로 보내고, index값을 넣어서 보낸다 - index key값, value값은 index에
        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }
}
