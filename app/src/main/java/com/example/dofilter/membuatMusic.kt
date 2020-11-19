package com.example.dofilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class membuatMusic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membuat_music)
        val pemula = findViewById(R.id.pemula) as RelativeLayout

        pemula.setOnClickListener {
            startActivity(Intent(this, membuatMusicPemula::class.java))
        }

    }
}