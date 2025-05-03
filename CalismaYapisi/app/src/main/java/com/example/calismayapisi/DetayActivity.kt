package com.example.calismayapisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val gelenMesaj = intent.getStringExtra("mesaj")
        binding.textViewSonuc.text = gelenMesaj
    }

}