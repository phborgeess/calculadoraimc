package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text = result.toString()

        var classificao: String? = null
        if (result <= 18.5f) {
            classificao = "MAGREZA"
        } else if (result > 18.5f && result <= 24.9f){
            classificao = "NORMAL"
        } else if (result <= 25f && result <= 29.9f){
            classificao = "SOBREPESO"
        } else if (result <= 30f && result <= 39.9f) {
            classificao = "OBESIDADE"
        } else {
            classificao = "OBESIDADE GRAVE"
            }
        tvClassificacao.text = classificao
        }

    }