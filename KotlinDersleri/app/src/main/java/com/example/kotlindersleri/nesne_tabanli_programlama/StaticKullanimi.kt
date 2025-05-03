package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = ClassA()
    //Standart nesen tabanlı erişim
    /*
    println(a.x)
    a.metod()
    */

    //Sanal nesne - Virtual Object - Nameless(İsimsiz) Object
    /*
    println(ClassA().x)//1. Nesne
    ClassA().metod()//2. Nesne
    */
    //parantez varsa nesen oluşturulur parantez yoksa static kullanımı oluyor.
    //Static Kullanımı
    println(ClassA.x)
    ClassA.metod()
}