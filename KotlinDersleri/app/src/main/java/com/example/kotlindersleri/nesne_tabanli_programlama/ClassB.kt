package com.example.kotlindersleri.nesne_tabanli_programlama

class ClassB : MyInterface{
    override var degisken: Int = 100


    override fun method1() {
        println("Method 1 çalıştı")
    }

    override fun method2(): String {
        return "Method 2 çalıştı"
    }

}