package com.rimomo.ds42_practica_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
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
        val button6 = findViewById<Button>(R.id.face6)
        val generar = findViewById<Button>(R.id.buttonThrow)
        val button8 = findViewById<Button>(R.id.faces8)
        val button12 = findViewById<Button>(R.id.faces12)
        val clear = findViewById<Button>(R.id.clear)

        generar.setOnClickListener {
            val inputValue = value.text.toString().toIntOrNull()
            if (inputValue != null && inputValue in 1..3) {
                when (inputValue) {
                    1 -> {
                        result2.visibility = View.INVISIBLE
                        result3.visibility = View.INVISIBLE

                        when (selectedButton) {
                            button6 -> {
                                result1.text = Random.nextInt(1, 7).toString()
                            }
                            button8 -> {
                                result1.text = Random.nextInt(1, 9).toString()

                            }
                            button12 -> {
                                result1.text = Random.nextInt(1, 13).toString()

                            }
                        }
                    }

                    2 -> {
                        result2.visibility = View.VISIBLE
                        result3.visibility = View.INVISIBLE

                        when (selectedButton) {
                            button6 -> {
                                result1.text = Random.nextInt(1, 7).toString()
                                result2.text = Random.nextInt(1, 7).toString()
                            }
                            button8 -> {
                                result1.text = Random.nextInt(1, 9).toString()
                                result2.text = Random.nextInt(1, 9).toString()
                            }
                            button12 -> {
                                result1.text = Random.nextInt(1, 13).toString()
                                result2.text = Random.nextInt(1, 13).toString()
                            }
                        }
                    }

                    3 -> {
                        result3.visibility = View.VISIBLE
                        result2.visibility = View.VISIBLE
                        when (selectedButton) {

                            button6 -> {
                                result1.text = Random.nextInt(1, 7).toString()
                                result2.text = Random.nextInt(1, 7).toString()
                                result3.text = Random.nextInt(1, 7).toString()
                            }
                            button8 -> {
                                result1.text = Random.nextInt(1, 9).toString()
                                result2.text = Random.nextInt(1, 9).toString()
                                result3.text = Random.nextInt(1, 9).toString()
                            }
                            button12 -> {
                                result1.text = Random.nextInt(1, 13).toString()
                                result2.text = Random.nextInt(1, 13).toString()
                                result3.text = Random.nextInt(1, 13).toString()
                            }
                        }
                    }
                }
            }
            else {

                Toast.makeText(this, "Insert a number from 1 to 3", Toast.LENGTH_SHORT).show()
            }
        }

        button6.setOnClickListener {
            changeButtonColor(button6)

        }

        button8.setOnClickListener {
            changeButtonColor(button8)

        }

        button12.setOnClickListener {
            changeButtonColor(button12)

        }
        clear.setOnClickListener {
            value.text.clear()
            result1.text = " "
            result2.text = " "
            result3.text = " "
            resetButtonColor(button6)
            resetButtonColor(button8)
            resetButtonColor(button12)


        }

    }
    private fun resetButtonColor(button: Button) {
        button.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light))
    }

    private fun changeButtonColor(button: Button) {
        selectedButton?.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light))
        button.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_blue_light))
        selectedButton = button
    }
}