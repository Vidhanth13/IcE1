package com.example.ice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HelloWorlD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_worl_d)

        val tw = findViewById<TextView>(R.id.txtHelloeWorld)

        val English = findViewById<Button>(R.id.btnSpanish)

        English.setOnClickListener {
            tw.text = "Hola Mundo"
        }

        val French = findViewById<Button>(R.id.btnFrench)

        French.setOnClickListener {
            tw.text = "Bonjour le monde"
        }

        val German = findViewById<Button>(R.id.btnGerman)

        German.setOnClickListener {
            tw.text = "Hallo Welt"
        }

        val Afrikaans = findViewById<Button>(R.id.btnAfrikaans)

        Afrikaans.setOnClickListener {
            tw.text = "Hello Wêreld"
        }

        val Zulu = findViewById<Button>(R.id.btnZulu)

        Zulu.setOnClickListener {
            tw.text = "Sawubona Mhlaba"
        }

        val BackToEnglish = findViewById<Button>(R.id.btnBackToEnglish)

        BackToEnglish.setOnClickListener {
            tw.text = "Bonjour le monde"
        }

    }
}