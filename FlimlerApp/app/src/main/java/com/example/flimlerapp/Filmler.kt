package com.example.flimlerapp

import java.io.Serializable

class Filmler(var id: Int,
              var ad: String,
              var resim: String,
              var fiyat: Int) : Serializable {

}