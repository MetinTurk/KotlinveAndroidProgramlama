package com.example.arayuztasarimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arayuztasarimi.databinding.FragmentAnasayfaBinding
import kotlin.io.root


class AnasayfaFragment : Fragment() {
   private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Ceket" , "ceket" , 300)
        val u2 = Urunler(2,"Ceket" , "ceket" , 300)
        val u3 = Urunler(3,"Ceket" , "ceket" , 300)
        val u4 = Urunler(4,"Ceket" , "ceket" , 300)
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)


        return binding.root
    }


}







        val filmlerAdapter = FilmlerAdapter(requireContext() , filmlerListesi)
        binding.flimlerRv.adapter = filmlerAdapter

        binding.flimlerRv.layoutManager =
            StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL)

        return binding.root
    }


}