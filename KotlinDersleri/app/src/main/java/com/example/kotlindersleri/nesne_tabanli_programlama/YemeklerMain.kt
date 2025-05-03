package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val y1 = Yemekler(id = 100, ad = "Kofte" , fiyat = 249)

    //println("ID: ${y1.id}")
    //println("Ad: ${y1.ad}")
    //("Fiyat: ${y1.fiyat}")
    //println("--------------------------------------")
    y1.bilgiAl()

    //Değer atama/değiştirmek
    y1.fiyat = 350
    /*
    println("ID: ${y1.id}")
    println("Ad: ${y1.ad}")
    println("Fiyat: ${y1.fiyat}")
    println("--------------------------------------")
     */
    y1.bilgiAl()

    val y2 = Yemekler(100,"Baklava",300)
    /*
    println("ID: ${y2.id}")
    println("Ad: ${y2.ad}")
    println("Fiyat: ${y2.fiyat}")
    */
    y2.bilgiAl()
    y2.ad = "Soguk Baklava"
    /*
    println("--------------------------------------")
    println("ID: ${y2.id}")
    println("Ad: ${y2.ad}")
    println("Fiyat: ${y2.fiyat}")
    */
}