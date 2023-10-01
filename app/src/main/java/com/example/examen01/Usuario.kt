package com.example.examen01

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Usuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        val btnSalir :Button = findViewById(R.id.btnSalir)

        btnSalir.setOnClickListener{
            val titulo:String = "Salir"
            val mensaje:String = "¿Esta seguro que desea abandonar la aplicación?"

            showModalConfirmExit(titulo,mensaje);
        }

    }

    private fun showModalConfirmExit(titleMsg: String, bodyMsg: String) {
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.modal_salir)
        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val titulo: TextView = dialogConfirm.findViewById(R.id.modalTitulo)
        val mensaje: TextView = dialogConfirm.findViewById(R.id.modalMensaje)
        val btnAceptar:Button = dialogConfirm.findViewById(R.id.btnModalAceptar)
        val btnCancelar:Button = dialogConfirm.findViewById(R.id.btnModalCancelar)

        titulo.text=titleMsg
        mensaje.text=bodyMsg

        btnAceptar.setOnClickListener{
            val PantallaScreen = Intent(this,index::class.java)
            startActivity(PantallaScreen)
        }
        btnCancelar.setOnClickListener{
            Toast.makeText(this,"Siga disfrutando de la imagen", Toast.LENGTH_LONG).show()
            dialogConfirm.dismiss()
        }
        dialogConfirm.show()
    }
}