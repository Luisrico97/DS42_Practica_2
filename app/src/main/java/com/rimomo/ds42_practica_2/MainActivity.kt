package com.rimomo.ds42_practica_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random


private var selectedButton: Button? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val value = findViewById<EditText>(R.id.InsertValue)
        val result1 = findViewById<TextView>(R.id.Crap1)
        val result3 = findViewById<TextView>(R.id.Crap3)
        val result2 = findViewById<TextView>(R.id.Crap2)
        val button4 = findViewById<Button>(R.id.face4)
        val button6 = findViewById<Button>(R.id.faces6)
        val generar = findViewById<Button>(R.id.buttonThrow)
        val button8 = findViewById<Button>(R.id.faces8)
        val numeroAleatorio = Random.nextInt(1, 7)
        val numeroAleatorio2 = Random.nextInt(1, 9)
        val numeroAleatorio3 = Random.nextInt(1, 13)



        generar.setOnClickListener {
            result1.text = (numeroAleatorio).toString()
        }

        button4.setOnClickListener {
            changeButtonColor(button4)
        }

        button6.setOnClickListener {
            changeButtonColor(button6)
        }

        button8.setOnClickListener {
            changeButtonColor(button8)
        }
    }

    private fun changeButtonColor(button: Button) {
        selectedButton?.setBackgroundColor(resources.getColor(android.R.color.white))
        button.setBackgroundColor(resources.getColor(android.R.color.holo_blue_light))
        selectedButton = button
    }
}