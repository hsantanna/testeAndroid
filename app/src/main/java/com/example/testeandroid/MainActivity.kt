package com.example.testeandroid

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val context : Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun exibirTexto(view: View){
        val editText = findViewById<EditText>(R.id.editTextNome)
        // Toast.makeText(this, "Chamou: ${editText.text.toString()}", Toast.LENGTH_SHORT).show()

        val intento = Intent(context, segundaActivity::class.java)

        val parametros = Bundle()
        parametros.putString("msg", editText.text.toString())
        intento.putExtras(parametros)

        startActivity(intento)

    }
}