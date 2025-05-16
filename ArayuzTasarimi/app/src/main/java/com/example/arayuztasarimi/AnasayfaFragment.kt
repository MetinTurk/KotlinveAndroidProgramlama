package com.example.arayuztasarimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.arayuztasarimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
   private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"adidas HOOPS 4.0 J Siyah Unisex " , "ayakkabiAddidas" , 2300)
        val u2 = Urunler(2,"Nike REVOLUTION 7 Siyah Erkek Koşu Ayakkabısı" , "ayakkabiNike" , 2800)
        val u3 = Urunler(3,"Puma Smash 3.0 Buck Siyah Erkek Sneaker" , "ayakkabiPuma" , 2500)
        val u4 = Urunler(4,"Reebok RUN SPIRIT Siyah Erkek Koşu Ayakkabısı" , "ayakkabiReebok" , 2199)
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)

        val urunlerAdapter = UrunlerAdapter(requireContext() , urunlerListesi)
        binding.urunlerRv.adapter = urunlerAdapter

        binding.urunlerRv.layoutManager =
            StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.VERTICAL)


        return binding.root
    }


}
