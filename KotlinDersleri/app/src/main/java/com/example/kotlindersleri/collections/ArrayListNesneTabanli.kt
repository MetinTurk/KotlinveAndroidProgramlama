package com.example.kotlindersleri.collections

import kotlin.io.path.fileVisitor

fun main() {
    val f1 = Flimler(1, "Babam ve Oglum" , 50)
    val f2 = Flimler(2 , "Neseli Hayatlar" , 30)
    val f3 = Flimler(3 , "Kis Uykusu" , 80)

    val flimlerListesi = ArrayList<Flimler>()
    flimlerListesi.add(f1)
    flimlerListesi.add(f2)
    flimlerListesi.add(f3)

    for(film in flimlerListesi){
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }

    //Sıralama - Sorting
    println("---- Fiyata Artan ----")
    //Ascend - ASC
    val siralama1 = flimlerListesi.sortedWith(compareBy { it.fiyat })
    for(film in siralama1){
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }
    println("---- Ad Artan ----")
    val siralama3 = flimlerListesi.sortedWith(compareBy { it.ad })
    for(film in siralama3){
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }

    println("---- Fiyata Azalan ----")
    //Ascend - ASC
    val siralama2 = flimlerListesi.sortedWith(compareByDescending { it.fiyat })
    for(film in siralama2) {
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }

    println("---- Ad Azalan ----")
    //Ascend - ASC
    val siralama4 = flimlerListesi.sortedWith(compareByDescending { it.ad })
    for(film in siralama4) {
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }

    //Filtreleme
    println("------ Filtreleme 1 ----------")
    val filtreleme1 = flimlerListesi.filter { it.fiyat > 40 && it.fiyat < 60 }
    for(film in filtreleme1) {
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }

    println("------ Filtreleme 2 ----------")
    val filtreleme2 = flimlerListesi.filter { it.ad.contains("at") }
    for(film in filtreleme2) {
        println(" ${film.id} : ${film.ad} ${film.fiyat}TL ")
    }






}