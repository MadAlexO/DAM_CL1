package com.example.examen01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class index : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        val btnAceptar = findViewById<Button>(R.id.btnAceptar);
        val btnCancelar = findViewById<Button>(R.id.btnCancelar);

        btnAceptar.setOnClickListener{
            val hola = Intent(this, Usuario::class.java)
            startActivity(hola)
        }

        btnCancelar.setOnClickListener{
            Toast.makeText(applicationContext,"El usuario esta intentando cancelar el registro", Toast.LENGTH_LONG).show()
        }
    }
}