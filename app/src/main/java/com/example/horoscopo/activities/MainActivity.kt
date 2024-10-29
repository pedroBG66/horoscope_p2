package com.example.horoscopo.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.horoscopo.R
import com.example.horoscopo.data.Horoscope
import com.example.horoscopo.data.HoroscopeProvider

class MainActivity : AppCompatActivity() {


    private lateinit var horoscopeList: List<Horoscope>

    private lateinit var recyclerView: recyclerView

    //lateinit var adapter: HoroscopeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)

        horoscopeList = HoroscopeProvider.findAll()

        recyclerView = findViewById(R.id.recyclerView)









    }
}