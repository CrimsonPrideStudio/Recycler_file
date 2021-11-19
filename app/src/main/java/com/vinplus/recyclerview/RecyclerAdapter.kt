package com.vinplus.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var itemList:List<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var ContactName: TextView = view.findViewById(R.id.ContactName)
        var ContactNumber: TextView = view.findViewById(R.id.ContactNumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.ContactName.text = itemList[position] //temp variable
         // temp variable
    }

    override fun getItemCount(): Int {
       return itemList.size
    }
}