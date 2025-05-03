package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val f = Odev2Fonksiyonlar()

    println("Fahrenhiet Fonks kullanımı")
    var derece = 50.2
    var sonuc = f.fahrenhiet(derece)
    println("${derece} derece ${sonuc} fahrenhiet'dır")
    f.cizgiBas()

    println("Çevre hesapla fonks. kullanımı")
    var uzunKenar = 20
    var kisaKenar = 10
    f.cevreHesapla(uzunKenar , kisaKenar)
    f.cizgiBas()

    println("Faktoriyel Hesaplama fonks. kullanımı")
    var faktoriyelSayi = 5
    var sonucFaktoriyel = f.faktoriyel(faktoriyelSayi)
    println("${faktoriyelSayi}' nın faktoriyeli: ${sonucFaktoriyel}")
    f.cizgiBas()

    println("a harfi bulma fonks. kullanımı")
    var kelime = "Merhaba Ben Bir Küçük Kod Bloğu Başlangıcıyım..."
    f.bulucu(kelime)
    f.cizgiBas()

    println("İç açı Bulma fonks. kullanımı")
    var kenarSayisi = 5
    var toplamIcAci = f.icAciToplami(kenarSayisi)
    println("Toplam iç açı değeri: ${toplamIcAci} derece")
    f.cizgiBas()

    println("Maas Hesaplama fonks. kullanımı")
    var calisilanGun = 25
    var maas = f.maasHesapla(calisilanGun)
    println("Toplam maaşınız: ${maas} TL")
    f.cizgiBas()

    println("Kota ücreti hesaplama fonks. kullanimi")
    var kullanilanGB = 80
    var toplamKotaUcreti = f.kotaUcretiHesapla(kullanilanGB)
    println("Toplam ödeyeceğiniz ücret: ${toplamKotaUcreti} TL")


}