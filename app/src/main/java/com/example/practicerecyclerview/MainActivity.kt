package com.example.practicerecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var cars = mutableListOf<Cars>(Cars("Audi", "Q5","252hk", "379.900:-", R.drawable.audi_q5),
                                  (Cars("Audi", "RS6","560hk", "559.900:-", R.drawable.audi_rs6)),
                                  (Cars("Audi", "S8","605hk", "629.000:-", R.drawable.audi_s8)),
                                  (Cars("BMW", "M2 DCT","530hk", "449.900:-", R.drawable.bmw_m2_dct)),
                                  (Cars("BMW", "M140i","430hk", "389.000:-", R.drawable.bmw_m140i)),
                                  (Cars("BMW", "M850","530hk", "929.000:-", R.drawable.bmw_m850)),
                                  (Cars("Lamborghini", "Huracan Perfomante","630hk", "2.799.000:-", R.drawable.lamborghini_huracan_red)),
                                  (Cars("Mitsubishi", "Lancer Evo IX","408hk", "459.000:-", R.drawable.mitsubishi_lancer_evo_ix)),
                                  (Cars("Nissan", "GTR","1100hk", "939.000:-", R.drawable.nissan_gtr)),
                                  (Cars("Toyota", "Supra mk4","900hk", "529.000:-", R.drawable.toyota_supra_mk4)),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CarsRecycleAdapter(this, cars)

        recyclerView.adapter = adapter

    }
}