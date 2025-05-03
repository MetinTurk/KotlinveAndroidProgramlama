package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")//0.
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert : istediğimiz bir indekse
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma
    val m = meyveler.get(3)
    println(m)
    println(meyveler.get(3))
    println(meyveler[3])

    println("Boyut: ${meyveler.size}")
    meyveler.reverse()
    println(meyveler)

    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift: enumarated()
        println("$indeks. -> $meyve")
    }

    //Silme
    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}