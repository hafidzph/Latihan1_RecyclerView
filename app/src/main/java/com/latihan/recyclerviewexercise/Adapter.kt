package com.latihan.recyclerviewexercise

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val listSiswa: ArrayList<Student>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val nama = itemView.findViewById<TextView>(R.id.nama)
        val umur = itemView.findViewById<TextView>(R.id.umur)
        val img = itemView.findViewById<ImageView>(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.show_data, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = "Nama : " + listSiswa[position].nama
        holder.umur.text = "Umur : " + listSiswa[position].umur.toString()
        holder.img.setImageResource(listSiswa[position].img)
    }

    override fun getItemCount(): Int {
        return listSiswa.size
    }
}