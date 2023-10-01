package pe.cibertec.registerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val builder = AlertDialog.Builder(this)
        builder.setMessage("¿Está seguro de que desea abandonar la aplicación?")
        builder.setPositiveButton("Sí") { dialog, which ->

            // Volver a la pantalla inicial
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()
        }
        val msj = builder.create()

        val btnSalir = findViewById<Button>(R.id.btnSalir)
        btnSalir.setOnClickListener {
            msj.show()
        }


    }
}