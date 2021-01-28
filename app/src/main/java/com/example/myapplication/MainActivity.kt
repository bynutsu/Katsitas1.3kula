package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.RecyclerView)

        val products = ArrayList<Product>()
        products.add(Product(1, "Hyundai Tucson", "KA-101-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(2, "Mercedes Benz C class", "KA-100-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(3, "Audi A4","KA-103-CT", R.drawable.ic_baseline_directions_car_24, false))
        products.add(Product(14, "Hyundai Tucson", "KA-101-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(21, "Mercedes Benz C class", "KA-100-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(33, "Audi A4","KA-103-CT", R.drawable.ic_baseline_directions_car_24, false))
        products.add(Product(12, "Hyundai Tucson", "KA-101-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(25, "Mercedes Benz C class", "KA-100-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(31, "Audi A4","KA-103-CT", R.drawable.ic_baseline_directions_car_24, false))
        products.add(Product(18, "Hyundai Tucson", "KA-101-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(26, "Mercedes Benz C class", "KA-100-CT", R.drawable.ic_baseline_directions_car_24, true))
        products.add(Product(11, "Audi A4","KA-103-CT", R.drawable.ic_baseline_directions_car_24, false))



                val adapter = ProductAdapter(products)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter




    }



    }

