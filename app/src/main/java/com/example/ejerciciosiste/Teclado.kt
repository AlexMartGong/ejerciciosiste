package com.example.ejerciciosiste

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Teclado : AppCompatActivity() {

    lateinit var txtNumber:TextView
    var numbers = emptyArray<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teclado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtNumber = findViewById(R.id.txtNumbers)
    }

    fun number1 (v: View){
        numbers += "1"
        updateDisplay()
    }
    fun number2 (v: View){
        numbers += "2"
        updateDisplay()
    }
    fun number3 (v: View){
        numbers += "3"
        updateDisplay()
    }
    fun number4 (v: View){
        numbers += "4"
        updateDisplay()
    }
    fun allDelete (v: View){
        numbers = emptyArray()
        updateDisplay()
    }
    fun deleteOneValue (v: View){
        if (numbers.isNotEmpty()) {
            numbers = numbers.dropLast(1).toTypedArray()
            updateDisplay()
        }
    }
    fun updateDisplay() {
        txtNumber.text = numbers.joinToString(" ")
    }
}