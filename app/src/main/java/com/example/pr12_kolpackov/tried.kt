package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tried : AppCompatActivity() {
    private lateinit var buttonsa: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tried)
        buttonsa = findViewById(R.id.buttonvhod)
        buttonsa.setOnClickListener{
            val intent = Intent(this,five::class.java)
            startActivity(intent)}
    }
}