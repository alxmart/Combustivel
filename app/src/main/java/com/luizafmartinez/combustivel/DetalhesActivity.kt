package com.luizafmartinez.combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    private lateinit var btnFechar : Button

    private lateinit var textGasolina : TextView
    private lateinit var textAlcool : TextView
    private lateinit var textResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

       textGasolina = findViewById(R.id.txt_gasolina)
       textAlcool = findViewById(R.id.txt_alcool)
       textResultado = findViewById(R.id.txt_resultado)

       val bundle = intent.extras

       if (bundle != null) {

           val gasolina = bundle.getDouble("gasolina")
           val alcool = bundle.getDouble("alcool")

           textGasolina.text = "Preço Gasolina: $gasolina"
           textAlcool.text = "Preço Álcool: $alcool"

           val resultado = (alcool / gasolina)

           if (resultado > 0.7) {
               textResultado.text = "Gasolina"
           } else {
               textResultado.text = "Álcool"
           }

       }

        btnFechar = findViewById(R.id.btn_fechar)
        btnFechar.setOnClickListener {
            finish()
        }
    }
}