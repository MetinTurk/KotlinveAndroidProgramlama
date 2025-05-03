package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import kotlin.math.log


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater , container , false)
        // Inflate the layout for this fragment
        val bundle: DetayFragmentArgs by navArgs()  //by keywordü aktarım yaptığımızı gösteriyor
        val gelenMesaj = bundle.mesaj
        val gelenSayi = bundle.sayi

        binding.textViewSonuc.text = "$gelenMesaj - $gelenSayi"

        val geriTusu = object : OnBackPressedCallback(false){//true: geri dönüş pasif
            override fun handleOnBackPressed() {
                Log.e("Detay sayfa" , "Geri tuşu çalıştı")
                isEnabled = false   // eğer yinede geri döndürmek istiyorsak bunu yapıyoruz.
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)   //detay frag. üzerinde çalışan activity temsil ediyo (main activity)
        return binding.root
    }
}