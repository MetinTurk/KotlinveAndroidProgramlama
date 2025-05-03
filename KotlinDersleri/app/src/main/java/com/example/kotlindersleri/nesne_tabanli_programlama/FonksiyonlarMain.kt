package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("Gelen Sonuc: $gelenSonuc")

    //parametre
    f.selamla3("Sila")

    f.topla(10,20,"Sila")

}