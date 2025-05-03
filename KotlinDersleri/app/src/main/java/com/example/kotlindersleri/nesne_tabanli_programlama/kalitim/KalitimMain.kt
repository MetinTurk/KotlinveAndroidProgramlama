package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()//Kalıtım yok, kendi methoduna erişti.
    memeli.sesCikar()//Kalıtım var, bir üst sınıfın methoduna erişti.
    kedi.sesCikar()//Kalıtım var, kendi methoduna erişti
    kopek.sesCikar()//Kalıtım var, kendi methoduna erişti
}