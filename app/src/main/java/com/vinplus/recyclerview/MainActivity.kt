package com.vinplus.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerView: RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var list:List<String> = arrayListOf("Pro","skks","ksksk")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)
    RecyclerAdapter(list)
        recyclerView = findViewById(R.id.RecView)
    }
}