package com.example.flimlerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.flimlerapp.databinding.CardTasarimBinding
import com.example.flimlerapp.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class FilmlerAdapter(var mContext: Context , val filmlerListesi: List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        var binding =  CardTasarimBinding.inflate(LayoutInflater.from(mContext) , parent , false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val film = filmlerListesi.get(position)//döngü gibi çalışır bütün elemanlara erişmemiz sağlar
        val t = holder.tasarim
        t.textViewFiyat.text = "${film.fiyat} ₺"
        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim , "drawable" , mContext.packageName)
        )
        
        t.buttonSepet.setOnClickListener {
            Snackbar.make(it, "${film.ad} sepete eklendi" , Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return  filmlerListesi.size
    }
}