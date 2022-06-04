package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Timer;

class secondact : AppCompatActivity() {
    private lateinit var buttonsa: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondact)
        buttonsa = findViewById(R.id.buttonvhod)
        buttonsa.setOnClickListener{
            val intent = Intent(this,four::class.java)
            startActivity(intent)}
            }
        }




