package pe.cibertec.registerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCancelar = findViewById<Button>(R.id.btnCancelar);
        btnCancelar.setOnClickListener {
            Toast.makeText(applicationContext, "El usuario está intentando cancelar el registro", Toast.LENGTH_SHORT).show()
        }

        val btnCrear = findViewById<Button>(R.id.btnCrear)
        btnCrear.setOnClickListener {
            val bienvenida = Intent(this, WelcomeActivity::class.java)
            startActivity(bienvenida)
        }



    }
}