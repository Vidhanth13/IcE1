package com.example.ice1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.btnEnter)

        buttonNext.setOnClickListener {

            val Intent = Intent(this,HelloWorlD::class.java);
            startActivity(Intent);
            finish();
        }
    }

}