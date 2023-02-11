package com.example.curso_projeto_alura

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
fun main() {
    val cod_cliente = "#532432"
    println("Codigo do Cliente: $cod_cliente")
}
