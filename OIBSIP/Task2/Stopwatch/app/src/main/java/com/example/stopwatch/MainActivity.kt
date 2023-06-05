package com.example.stopwatch

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import com.example.stopwatch.R.id.stopwatchh

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnnstart=findViewById<Button>(R.id.btnnstart)
        var btnnstop=findViewById<Button>(R.id.btnnstop)
        var stopwatchh=findViewById<Chronometer>(R.id.stopwatchh)
        var btnnreset=findViewById<Button>(R.id.btnnreset)
        var pause: Long=0
        btnnstart.setOnClickListener(){
            stopwatchh.base= SystemClock.elapsedRealtime()
            stopwatchh.start()
        }
        btnnstop.setOnClickListener(){
            pause=SystemClock.elapsedRealtime()-stopwatchh.base
            stopwatchh.stop()
        }
        btnnreset.setOnClickListener(){
            stopwatchh.base=SystemClock.elapsedRealtime()
        }


    }

}