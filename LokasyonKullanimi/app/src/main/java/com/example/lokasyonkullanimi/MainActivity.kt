package com.example.lokasyonkullanimi

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lokasyonkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var izinKontrol = 0

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonKonum.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this , Manifest.permission.ACCESS_FINE_LOCATION)

            if(izinKontrol == PackageManager.PERMISSION_GRANTED){

            }else{
                ActivityCompat.requestPermissions(this , arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),100)//100 = istek kodu (aramak istediğimizde onumla bulucaz)
            }
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String?>,
        grantResults: IntArray,
        deviceId: Int
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId)
        if(requestCode == 100){
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(applicationContext, "İzin onaylandı", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "İzin onaylanmadı", Toast.LENGTH_SHORT).show()
            }
        }
    }
}