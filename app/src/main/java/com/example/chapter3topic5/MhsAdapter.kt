package com.example.chapter3topic5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MhsAdapter(val listMhs : ArrayList<ListMhs>) : RecyclerView.Adapter<MhsAdapter.ViewHolder>() {
    //ambil id dari layout
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var namaMhs = view.findViewById<TextView>(R.id.namaMhs)
        var npmMhs = view.findViewById<TextView>(R.id.npmMhs)
        var imgMhs = view.findViewById<ImageView>(R.id.imgMhs)
    }

    //buat object viewholder; untuk registerview; inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_mhs, parent,false)
        return ViewHolder(view)
    }

    //untuk set data ke layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaMhs.text = listMhs[position].nama
        holder.npmMhs.text = listMhs[position].npm
        holder.imgMhs.setImageResource(listMhs[position].img)
    }

    //nampilin jumlah data di recycler view
    override fun getItemCount(): Int {
        return listMhs.size
    }

}