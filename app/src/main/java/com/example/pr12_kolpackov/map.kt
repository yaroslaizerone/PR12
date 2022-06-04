package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class map : AppCompatActivity() {

        private lateinit var buttonsa: ImageButton
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
            buttonsa = findViewById(R.id.imbt)
            buttonsa.setOnClickListener{
                val intent = Intent(this,five::class.java)
                startActivity(intent)}
    }
}