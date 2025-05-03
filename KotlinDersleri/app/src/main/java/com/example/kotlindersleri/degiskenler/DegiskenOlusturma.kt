package com.example.kotlindersleri.degiskenler

fun main() {
    println("Merhaba Dünya")
    var yas = 19
    //var sayi : int = 19
    var id = 1
    var ad  = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    //println("Id : " + id)
    println("Id: $id")
    println("Ad: $ad")
    println("Resim: $resim")
    println("Puan: $puan")
    println("Fiyat: $fiyat")
    println("StokDurum: $stokDurum")

    // Sabitler (constant)
    var sayi = 30
    sayi = 100
    println(sayi)


    val numara = 50     //Değişkenin değerini değiştirmeyeceğimizi söyledik (sabitledik)
    println(numara)

    //Tür Dönüşümleri
    // 1- Sayısaldan sayısala dönüşüm
    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2- Sayısaldan metine dönüşüm
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3- Metinden sayısala dönüşüm
    val yazi = "48T"
    val sonuc4 = yazi.toIntOrNull()     //Kontrollü dönüşüm yapmak için kullanılır.
    println(sonuc4)

    if(sonuc4 != null)
    {
        println(sonuc4)
    }
    else
    {
        println("Sonuc nulldur.")
    }



}