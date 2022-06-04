package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class History : AppCompatActivity() {
    private lateinit var buttonsa: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        buttonsa = findViewById(R.id.imbt)
        buttonsa.setOnClickListener{
            val intent = Intent(this,five::class.java)
            startActivity(intent)}
    }
}