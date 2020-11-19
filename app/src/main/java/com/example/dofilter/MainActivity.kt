package com.example.dofilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val membuatMusic =findViewById(R.id.membuatMusic) as RelativeLayout
        val mengeditVideo =findViewById(R.id.mengeditVideo) as RelativeLayout
        val bermainGitar =findViewById(R.id.bermainGitar) as RelativeLayout
        membuatMusic.setOnClickListener(){
            startActivity(Intent(this, com.example.dofilter.membuatMusic::class.java))
        }
        mengeditVideo.setOnClickListener {
            startActivity(Intent(this, com.example.dofilter.mengeditVideo::class.java))
        }
        bermainGitar.setOnClickListener {
            startActivity(Intent(this, com.example.dofilter.bermainGitar::class.java))
        }





    }



}