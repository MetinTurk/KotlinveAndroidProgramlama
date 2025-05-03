package com.example.kotlindersleri.collections

fun main() {
    //Hashset
    //Tanımlama
    val meyveler = HashSet<String>()
    //Any -> en üst sınıf demektir.
    //Bütün türleri kapsar.
    //Java -> Object

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler)

    meyveler.add("Amasya Elma")
    println(meyveler)

    val y = meyveler.elementAt(2) // hangi indeksdeki elemanları istiyorsak onu çağırırız
    println(y)

    println("Boyut : ${meyveler.size}")

    for(meyve in meyveler){
        println("Sonuc: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){//Swift: enumarated()
        println("$indeks. -> $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)
}