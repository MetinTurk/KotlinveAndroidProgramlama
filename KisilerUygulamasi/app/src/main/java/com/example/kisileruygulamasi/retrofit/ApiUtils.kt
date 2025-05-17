package com.example.kisileruygulamasi.retrofit

class ApiUtils {
    companion object{
        val BASE_URL = ""

        fun getKisilerDao() : KisilerDao{//her tablo için hem fonks. hemde interface oluşturmamız gerekiyor
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao :: class.java)
        }

    }
}