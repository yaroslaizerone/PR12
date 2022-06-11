package com.example.pr12_kolpackov

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import java.util.*

class Taxi : AppCompatActivity() {
    private  lateinit var bt1 : Button
    private  lateinit var  l1: LinearLayout
    private  lateinit var  l2: LinearLayout
    private  lateinit var  l3: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taxi)

        bt1 = findViewById(R.id.bt1)
        l1 = findViewById(R.id.l1)
        l2 = findViewById(R.id.lsg)
        l3 = findViewById(R.id.line3)

        bt1.setOnClickListener{
            val intent = Intent(this,Taxi::class.java)
            startActivity(intent)}

        l1.setOnClickListener{
            l1.setBackgroundColor(R.drawable.round_bt)
            l2.setBackgroundColor(R.drawable.round_bt2)
            l3.setBackgroundColor(R.drawable.round_bt2)}

        l2.setOnClickListener{
            l1.setBackgroundColor(R.drawable.round_bt2)
            l2.setBackgroundColor(R.drawable.round_bt)
            l3.setBackgroundColor(R.drawable.round_bt2)}

        l3.setOnClickListener{
            l1.setBackgroundColor(R.drawable.round_bt2)
            l2.setBackgroundColor(R.drawable.round_bt2)
            l3.setBackgroundColor(R.drawable.round_bt)}
    }
    }
