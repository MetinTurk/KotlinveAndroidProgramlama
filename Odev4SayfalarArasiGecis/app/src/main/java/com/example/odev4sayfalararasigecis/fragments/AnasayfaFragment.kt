package com.example.odev4sayfalararasigecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4sayfalararasigecis.R
import com.example.odev4sayfalararasigecis.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater , container , false)

        binding.buttonSayfaA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)
        }

        binding.buttonSayfaX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)
        }

        return binding.root
    }


}