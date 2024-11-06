package com.example.mycityapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val coffeeshop: TextView = findViewById(R.id.coffee)
        coffeeshop.setOnClickListener {
            val intent = Intent(this, CoffeeRecoActivity::class.java)
            startActivity(intent)
        }
        val dancestudio: TextView = findViewById(R.id.dance)
        dancestudio.setOnClickListener {
            val intent = Intent(this, DanStuRecoActivity::class.java)
            startActivity(intent)
        }
        val university: TextView = findViewById(R.id.university)
        university.setOnClickListener {
            val intent = Intent(this, UniRecoAcitivty::class.java)
            startActivity(intent)
        }
    }
}