package com.example.chapter3topic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //masukin data dalam bentuk array
        val listMhsw = arrayListOf(
            ListMhs("Cheol", "001", R.drawable.ic_launcher_foreground),
            ListMhs("Han", "002", R.drawable.ic_launcher_foreground),
            ListMhs("Soo", "003", R.drawable.ic_launcher_foreground),
            ListMhs("Uji", "004", R.drawable.ic_launcher_foreground),
            ListMhs("Gyu", "005", R.drawable.ic_launcher_foreground),
        )

        val adapterMhsw = MhsAdapter(listMhsw)
        val layoutmanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //val gv = GridLayoutManager(this, 2)

        rvMhs.layoutManager = layoutmanager
        rvMhs.adapter = adapterMhsw
    }
}