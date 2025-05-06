package com.example.calismayapisiudemy

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calismayapisiudemy.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private  lateinit var tasarim: ActivityMainBinding
    private lateinit var  benimTextView: TextView
    private  lateinit var benimButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("onCreate",  "Çalıştı")
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonYap.setOnClickListener {
            Snackbar.make(it,"Merhaba", Snackbar.LENGTH_SHORT).show()
        }
        benimTextView = findViewById(R.id.benimTextView)
        benimButton = findViewById(R.id.benimButton)

        benimButton.setOnClickListener {
            benimTextView.text = "Merhaba"
        }

    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart" , "Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume" , "Çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause" , "Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop" , "Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy" , "Çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart" , "Çalıştı")
    }

}