package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class map : AppCompatActivity() {

        private lateinit var buttonsa: ImageButton
    private lateinit var butimg: ImageView
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
            buttonsa = findViewById(R.id.imbt)
            butimg = findViewById(R.id.taxi)
            buttonsa.setOnClickListener{
                val intent = Intent(this,five::class.java)
                startActivity(intent)}
            butimg.setOnClickListener{
                val intent = Intent(this,Taxi::class.java)
                startActivity(intent)}
    }
}