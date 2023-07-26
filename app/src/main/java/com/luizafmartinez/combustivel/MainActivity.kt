package com.luizafmartinez.combustivel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular : Button
    lateinit var editPrecoGas : EditText
    lateinit var editPrecoAlc : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editPrecoGas = findViewById(R.id.preco_gas)
        editPrecoAlc = findViewById(R.id.preco_alc)
        btnCalcular = findViewById(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

            val intent = Intent (this, DetalhesActivity::class.java)

            val gasolina = editPrecoGas.text.toString()
            val alcool   = editPrecoAlc.text.toString()

            if ( gasolina.isNotEmpty() && alcool.isNotEmpty() ) {
                intent.putExtra( "gasolina" , gasolina.toDouble())
                intent.putExtra( "alcool" , alcool.toDouble())
            }

            startActivity(intent)
        }

    }
}