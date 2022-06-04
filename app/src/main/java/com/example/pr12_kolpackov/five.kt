package com.example.pr12_kolpackov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class five : AppCompatActivity() {
    private lateinit var buttonsa: ImageButton
    private lateinit var buttonsa2: ImageButton
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var buttonsa3: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)
        buttonsa = findViewById(R.id.ib1)
        buttonsa2 = findViewById(R.id.ib2)
        textView1 = findViewById(R.id.tv1)
        textView2 = findViewById(R.id.tv2)
        buttonsa3 = findViewById(R.id.imbt)

        buttonsa.setOnClickListener{
            val intent = Intent(this,History::class.java)
            startActivity(intent)}
        buttonsa2.setOnClickListener{
            val intent = Intent(this,Settings::class.java)
            startActivity(intent)}
        buttonsa3.setOnClickListener{
            val intent = Intent(this,map::class.java)
            startActivity(intent)}
        textView1.setOnClickListener{
            val intent = Intent(this,History::class.java)
            startActivity(intent)}
        textView2.setOnClickListener{
            val intent = Intent(this,Settings::class.java)
            startActivity(intent)}
    }
}
