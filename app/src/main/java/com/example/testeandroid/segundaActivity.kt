package com.example.testeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class segundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val textView = findViewById<TextView>(R.id.textView)

        val params = intent.extras
        val mensagem = params?.getString("msg")

        textView.setText("Mensagem recebida: $mensagem")
    }
}