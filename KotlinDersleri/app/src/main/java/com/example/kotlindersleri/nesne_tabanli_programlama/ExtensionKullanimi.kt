package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //val sonuc = 5.carp(2)
    val sonuc = 5 carp 2    //fonks önüne infix eklediğimiz için böyle yapabildik.
    println(sonuc)
}

//fonks. adının önüne hangi sınıfı genişletmek istiyorsak onu yazıcaz
//infix :
infix fun Int.carp(sayi: Int): Int{

    return this * sayi //this(Int)
}

// varsayılan public görevi olur.
// var == public