package com.example.kisileruygulamasi.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel  : ViewModel() {
    var kisilerRepository = KisilerRepository()

    fun sil(kisi_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            kisilerRepository.sil(kisi_id)
        }
    }
}