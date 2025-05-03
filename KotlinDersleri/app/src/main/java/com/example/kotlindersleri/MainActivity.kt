package com.example.kotlindersleri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var str: String? = null
    lateinit var infoo:String //Daha sonra bu değişkene değer atıcam demek.
    //lateinit sadece var ile kullanılır,val kullanılmaz.
    //bunlarda değer ataması yapıldığı için lateinit kullanılamaz.
    var x: Int = 0
    var y: Double = 0.0
    var kontrol: Boolean = false
    //infoo = "Merhaba"     //hata alıyorum
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }
    }

