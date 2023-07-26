package com.luizafmartinez.combustivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val intent = Intent (this, DetalhesActivity::class.java)
            startActivity(intent)
        }

    }
}