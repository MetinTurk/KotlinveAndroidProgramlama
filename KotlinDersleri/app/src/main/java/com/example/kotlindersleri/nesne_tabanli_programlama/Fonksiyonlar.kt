package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {

    //void - sadece işlem yapan
    fun selamla1() {//Swift -> func
        val sonuc = "Merhaba Sila"
        println(sonuc)
    }

    //return -> hem işlem yapan hem de veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhaba Sila"
        return sonuc
    }

    //Parametre
    fun selamla3(isim: String) {
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //Overloading
    //Bir sınıf içerisinde aynı isimde fonksiyonları tekrar tekrar kullanabilmek
    fun topla(sayi1:Int, sayi2: Int){
        println("Toplam: ${sayi1+sayi2}")
    }

    fun topla(sayi1: Int,sayi2: Int,sayi3: Int){
        println("Toplam: ${sayi1+sayi2+sayi3}")
    }

    fun topla(sayi1: Int,sayi2: Int,isim: String){
        println("Toplam: ${sayi1+sayi2} islem yapan: $isim")
    }

}