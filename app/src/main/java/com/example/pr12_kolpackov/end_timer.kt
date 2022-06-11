package com.example.pr12_kolpackov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class end_timer : AppCompatActivity() {
    private lateinit var bt1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_timer)

        bt1 = findViewById(R.id.bt1)

        bt1.setOnClickListener {
            val text = "Время вышло!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()  }
    }
}