package com.example.chapter3topic5.latihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chapter3topic5.R

class ProvinsiAdapter(val listProvinsi: ArrayList<ListProvinsi>):RecyclerView.Adapter<ProvinsiAdapter.ViewHolder>() {
    class ViewHolder(view:View) : RecyclerView.ViewHolder(view) {
        var prov = view.findViewById<TextView>(R.id.provinsi)
        var ibukota = view.findViewById<TextView>(R.id.ibukota)
        var imgProv = view.findViewById<ImageView>(R.id.imgProvinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.prov.text = listProvinsi[position].prov
        holder.ibukota.text = listProvinsi[position].kota
        holder.imgProv.setImageResource(listProvinsi[position].img)
    }

    override fun getItemCount(): Int {
        return listProvinsi.size
    }

}