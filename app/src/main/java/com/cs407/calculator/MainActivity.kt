package com.cs407.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val numInput1 = findViewById<EditText>(R.id.editTextText)
        val numInput2 = findViewById<EditText>(R.id.editTextText2)
        val add = findViewById<Button>(R.id.Addition)
        val multiply = findViewById<Button>(R.id.Multiply)
        val divide = findViewById<Button>(R.id.Divide)
        val subtract = findViewById<Button>(R.id.Subtract)
        add.setOnClickListener{
            val userInput1 = numInput1

        }

    }
}