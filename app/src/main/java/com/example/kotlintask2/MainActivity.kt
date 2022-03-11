package com.example.kotlintask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val num2= findViewById<EditText>(R.id.editTextTextPersonName2)
        val Text= findViewById<TextView>(R.id.textView)
        val buttonSubmit = findViewById<Button>(R.id.button)
        buttonSubmit.setOnClickListener {
val number1=num1.text.toString().toInt()
            val number2=num2.text.toString().toInt()
           val result=number1+number2;
Text.setText(result.toString())

        }
    }
}