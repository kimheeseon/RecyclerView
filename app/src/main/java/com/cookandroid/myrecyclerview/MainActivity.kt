package com.cookandroid.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG : String = "로그"
    var modelList = ArrayList<MyModel>()

    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        Log.d(TAG, "MainActivity - 반복문 돌리기 전 this.modelList.size : ${this.modelList.size}")

        for(i in 1..10){
            var myModel = MyModel(name = "김종현 $i", profileImage = "https://search.pstatic.net/sunny/?src=http%3A%2F%2Fimg.theqoo.net%2Fimg%2FwdJZR.jpg&amp;type=sc960_832" )
            this.modelList.add(myModel)
        }
        Log.d(TAG, "MainActivity - 반복문 돌린 후 this.modelList.size : ${this.modelList.size}")

        //어답터 인스턴스 생성
        myRecyclerAdapter = MyRecyclerAdapter()
        myRecyclerAdapter.submitList(this.modelList)

        my_recycler_view.apply{
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)

            adapter = myRecyclerAdapter
        }
    }
}
