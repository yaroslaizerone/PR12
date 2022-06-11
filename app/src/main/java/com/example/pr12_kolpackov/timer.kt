package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class timer : AppCompatActivity() {
    private lateinit var timer: TextView
    private lateinit var bt1: Button
    private lateinit var bt2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        timer = findViewById(R.id.timer1)
        bt1 = findViewById(R.id.bt1)
        bt2 = findViewById(R.id.bt2)


        bt1.setOnClickListener{
            val intent = Intent(this,end_timer::class.java)
            startActivity(intent)
        }

        bt2.setOnClickListener{
            val intent = Intent(this,Taxi::class.java)
            startActivity(intent)
        }
    }
}