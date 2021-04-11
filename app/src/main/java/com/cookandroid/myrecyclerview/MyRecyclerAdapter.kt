package com.cookandroid.myrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter(myRecyclerviewInterface: MyRecyclerviewInterface): RecyclerView.Adapter<MyViewHolder>() {
    val TAG : String = "로그"
    private var modelList = ArrayList<MyModel>()

    private var myRecyclerviewInterface :MyRecyclerviewInterface? = null

    //생성자
    init{
        this.myRecyclerviewInterface = myRecyclerviewInterface
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_item, parent, false), this.myRecyclerviewInterface!!)
    }

    override fun getItemCount(): Int {
        return this.modelList.size
    }

    override fun onBindViewHolder(holder : MyViewHolder, position: Int) {
        Log.d(TAG, "MyRecyclerAdapter - onbindViewHolder() called / position: $position")
        holder.bind(this.modelList[position])
        //클릭 리스너 설정
//        holder.itemView.setOnClickListener {
//            Toast.makeText(APP.instance, "클릭됨: ${this.modelList[position].name}", Toast.LENGTH_SHORT).show()
//        }
    }

    fun submitList(modelList: ArrayList<MyModel>){
        this.modelList = modelList
    }

}