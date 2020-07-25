package com.example.myapplication.diffutils.Util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MyAdapter(private val dataSource: MutableList<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var my_text_view: TextView

        init {
            my_text_view = itemView.findViewById(R.id.txt_text) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.my_text_view.text = dataSource.get(position)
    }

    fun insertItem(newList: List<String>) {
        val diffUtilCallback = MyDiffUtilCallback(dataSource, newList)
        val diffResult = DiffUtil.calculateDiff(diffUtilCallback)

        dataSource.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }

    fun updateItem(newList: List<String>) {
        val diffUtilCallback = MyDiffUtilCallback(dataSource, newList)
        val diffResult = DiffUtil.calculateDiff(diffUtilCallback)

        dataSource.clear()
        dataSource.addAll(newList)
        diffResult.dispatchUpdatesTo(this)
    }

}