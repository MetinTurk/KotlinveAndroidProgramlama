package com.example.kotlindersleri

fun main() {
    //1.Compile Eror: Kodlama yaparken oluşur.
    val sayi = 100
    //sayi = 500

    //2. Runtime Error (Exceptions)
    val x = 10
    val y = 0



    try {
        println("Sonuc: ${x/y}")
        println("İşlem Tamamlandı")
    }catch (e: ArithmeticException){
        println("İkinci sayı sıfır olamaz")
    }
    catch (e: NullPointerException){
        println("İkinci sayı 0 olamaz")
    }

}