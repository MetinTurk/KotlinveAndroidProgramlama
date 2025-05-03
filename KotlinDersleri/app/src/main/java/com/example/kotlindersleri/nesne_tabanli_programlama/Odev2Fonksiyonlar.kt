package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2Fonksiyonlar {
    fun fahrenhiet(sayi1: Double) : Double{
        val sonuc = (sayi1*1.8)+32
        return sonuc
    }

    fun cevreHesapla(uzunKenar:Int , kisaKenar : Int){
        val sonuc = (uzunKenar+kisaKenar)*2
        println("Dikdörtgenin çevresi: ${sonuc}")
    }

    fun faktoriyel(sayi:Int):Int{
        var faktoriyel = 1
        for(i in sayi downTo 1){
            faktoriyel *= i
        }
        return faktoriyel
    }

    fun bulucu(kelime: String){
        var sayi = 0
        for (i in kelime.lowercase()){
            if(i == 'a')
            {
                sayi++
            }
        }
        println("'${kelime}' de toplam a harfi sayısı: ${sayi}")
    }

    fun icAciToplami(kenarSayisi: Int):Int{
        return (kenarSayisi-2)*180
    }

    fun maasHesapla(calisilanGun: Int): Int{
        var toplamCalisilanSaat = calisilanGun * 8
        var toplamIsSaati = 0
        var toplamMesaiSaati = 0
        if(toplamCalisilanSaat >= 160)
        {
            toplamIsSaati = 160
            toplamMesaiSaati = toplamCalisilanSaat - toplamIsSaati
        }
        else
        {
            toplamIsSaati = 160
        }
        var maas = (toplamIsSaati*10)+(toplamMesaiSaati*20)
        return maas
    }

    fun kotaUcretiHesapla(kullanilanGB: Int): Int{
        if(kullanilanGB <= 50)
        {
            return 100
        }
        else
        {
            var asim = kullanilanGB-50
            return 100+(asim*4)
        }
    }
    fun cizgiBas(){
        println("-----------------------------------")
    }
}