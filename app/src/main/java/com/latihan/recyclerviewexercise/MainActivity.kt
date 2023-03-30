package com.latihan.recyclerviewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listSiswa = arrayListOf(Student("Hafidz", 20, R.drawable.img),
            Student("Debora", 25, R.drawable.img),
            Student("Fulan", 19, R.drawable.img),
            Student("Lula", 19, R.drawable.img),
            Student("Fina", 18, R.drawable.img),
            Student("Bila", 13, R.drawable.img),
            Student("Romlah", 27, R.drawable.img)
        )

        val adapter = Adapter(listSiswa)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager= layoutManager
        recyclerView.adapter = adapter
    }

}