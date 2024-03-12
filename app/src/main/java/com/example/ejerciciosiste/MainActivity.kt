package com.example.ejerciciosiste

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun action1(v: View) { //explicita
        Log.w("Interconexiones app", " Button 1")
        val intencion1 = Intent(this, Teclado::class.java)
        startActivity(intencion1)
    }

    fun action2(v: View) { //implicita
        Log.w("Interconexiones app", " Button 2")
        val aPagina = Intent(android.content.Intent.ACTION_VIEW)
        aPagina.data = Uri.parse("https://google.com.mx")
        startActivity(aPagina)
    }
}