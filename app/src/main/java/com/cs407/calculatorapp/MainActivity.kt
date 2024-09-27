package com.cs407.calculatorapp

import android.content.Intent
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

        // Define the 2 edit text
        val editFirstNum = findViewById<EditText>(R.id.firstNumber)
        val editSecondNum = findViewById<EditText>(R.id.secondNumber)

        // Define all 4 buttons
        val multi = findViewById<Button>(R.id.multiplication)
        val add = findViewById<Button>(R.id.addition)
        val sub = findViewById<Button>(R.id.subtraction)
        val division = findViewById<Button>(R.id.divide)
        multi.setOnClickListener {
            // Get numbers from EditText and convert to double (or Int, based on your need)
            val firstNum = editFirstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = editSecondNum.text.toString().toDoubleOrNull() ?: 0.0

            // Perform multiplication
            val calcAnswer = firstNum * secondNum

            // Convert result to string for display
            val resultString = calcAnswer.toString()

            // Create an intent to navigate to CalculatorResult Activity
            val intent = Intent(this, CalculatorResult::class.java)
            // Pass the calculated result to the new activity
            intent.putExtra("EXTRA_MESSAGE", resultString)

            // Start the new activity
            startActivity(intent)
        }

        add.setOnClickListener {
            // Get numbers from EditText and convert to double (or Int, based on your need)
            val firstNum = editFirstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = editSecondNum.text.toString().toDoubleOrNull() ?: 0.0

            // Perform multiplication
            val calcAnswer = firstNum + secondNum

            // Convert result to string for display
            val resultString = calcAnswer.toString()

            // Create an intent to navigate to CalculatorResult Activity
            val intent = Intent(this, CalculatorResult::class.java)
            // Pass the calculated result to the new activity
            intent.putExtra("EXTRA_MESSAGE", resultString)

            // Start the new activity
            startActivity(intent)
        }

        sub.setOnClickListener {
            // Get numbers from EditText and convert to double (or Int, based on your need)
            val firstNum = editFirstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = editSecondNum.text.toString().toDoubleOrNull() ?: 0.0

            // Perform multiplication
            val calcAnswer = firstNum - secondNum

            // Convert result to string for display
            val resultString = calcAnswer.toString()

            // Create an intent to navigate to CalculatorResult Activity
            val intent = Intent(this, CalculatorResult::class.java)
            // Pass the calculated result to the new activity
            intent.putExtra("EXTRA_MESSAGE", resultString)

            // Start the new activity
            startActivity(intent)
        }

        division.setOnClickListener {
            // Get numbers from EditText and convert to double (or Int, based on your need)
            val firstNum = editFirstNum.text.toString().toDoubleOrNull() ?: 0.0
            val secondNum = editSecondNum.text.toString().toDoubleOrNull() ?: 0.0

            // Perform multiplication
            val calcAnswer = firstNum / secondNum

            // Convert result to string for display
            val resultString = calcAnswer.toString()

            // Create an intent to navigate to CalculatorResult Activity
            val intent = Intent(this, CalculatorResult::class.java)
            // Pass the calculated result to the new activity
            intent.putExtra("EXTRA_MESSAGE", resultString)

            // Start the new activity
            startActivity(intent)
        }

        }

    }
