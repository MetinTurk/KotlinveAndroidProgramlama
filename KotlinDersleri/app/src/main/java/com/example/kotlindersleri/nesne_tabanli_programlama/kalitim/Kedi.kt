package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

class Kedi: Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> : kalıtım ile üst sınıfı(Memeli) temsil eder
        println("Miyav Miyav")
    }
}