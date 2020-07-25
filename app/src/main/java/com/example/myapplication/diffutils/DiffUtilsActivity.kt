package com.example.myapplication.diffutils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.diffutils.Util.MyAdapter
import kotlinx.android.synthetic.main.activity_diff_utils.*
import java.util.*
import kotlin.collections.ArrayList

class DiffUtilsActivity : AppCompatActivity() {

    internal val dataSource: MutableList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diff_utils)

        initData()

        recycler_view.setHasFixedSize(true)
        recycler_view.layoutManager = (LinearLayoutManager(this))

        val adapter = MyAdapter(dataSource)
        recycler_view.adapter = adapter

        btn_insert.setOnClickListener {
            val newData = ArrayList<String>()
            for (i in 0..2) {
                newData.add(UUID.randomUUID().toString())
                adapter.insertItem(newData)
                recycler_view.smoothScrollToPosition(adapter.itemCount - 1)
            }

            btn_update.setOnClickListener {
                val newData = ArrayList<String>()
                for (i in 0..2) {
                    newData.add(UUID.randomUUID().toString())
                    adapter.updateItem(newData)
                }
            }
        }
    }


    private fun initData() {
        for (i in 0..1) {
            dataSource.add(UUID.randomUUID().toString())
        }
    }
}
