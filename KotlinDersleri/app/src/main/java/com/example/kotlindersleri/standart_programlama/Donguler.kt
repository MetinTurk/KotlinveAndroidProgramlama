package com.example.kotlindersleri.standart_programlama

fun main() {
    //1 , 2 , 3
    //Koşul yazmak için (baslangic..bitis)
    for(i in 1..3){//Swift için 1...3   i = index(dizilerdeki index zorundasın)
        println("Dongü 1 : $i")     //yan yana yazmak için print()
    }

    //10 ile 20 arasında 5 er artsın
    for(x in 10..20 step 5){    //step = adım yani 5 er 5 er artıyor
        println("Dongü 2 : $x")
    }

    //for(i in 20 >= downTo >= 10 step 5)     //Geriye doğru döngü
    //{
        //println("Döngü 3: $i")
    //}

    var sayac = 1
    while(sayac < 4)
    {
        println("Döngü 4: $sayac")
        sayac += 1
        //sayac = sayac +1
        //sayac++

    }
    //1,2,3,4,5
    for(i in 1..5){
        if(i == 3)
        {
            break//Döngüyü durdurur
        }
        println("Döngü 5: $i")
    }

    //1,2,3,4,5
    for(i in 1..5){
        if(i == 3)
        {
            continue//Bulnduğu adımı pas geçer.
        }
        println("Döngü 6: $i")
    }



}