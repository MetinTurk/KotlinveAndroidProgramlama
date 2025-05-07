package com.example.odev4sayfalararasigecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4sayfalararasigecis.R
import com.example.odev4sayfalararasigecis.databinding.FragmentAnasayfaBinding
import com.example.odev4sayfalararasigecis.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container , false)
        binding.buttonSayfaB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBGecis)
        }

        return binding.root
    }


}