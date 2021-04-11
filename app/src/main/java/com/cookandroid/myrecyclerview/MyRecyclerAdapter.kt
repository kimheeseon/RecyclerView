package com.cookandroid.myrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter: RecyclerView.Adapter<MyViewHolder>() {
    val TAG : String = "로그"
    private var modelList = ArrayList<MyModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_item, parent, false))
    }

    override fun getItemCount(): Int {
        return this.modelList.size
    }

    override fun onBindViewHolder(holder : MyViewHolder, position: Int) {
        Log.d(TAG, "MyRecyclerAdapter - onbindViewHolder() called / position: $position")
        holder.bind(this.modelList[position])
    }

    fun submitList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }

}