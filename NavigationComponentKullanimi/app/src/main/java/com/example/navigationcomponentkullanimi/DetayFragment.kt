package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding


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
        return binding.root
    }
}