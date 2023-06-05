package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input=findViewById<EditText>(R.id.input)
        var result=findViewById<TextView>(R.id.res)
        var button=findViewById<TextView>(R.id.convert)

        button.setOnClickListener(){
            var kg=input.text.toString().toInt()
            var reso = kg*1000
            result.setText(reso.toString())

        }
    }
}