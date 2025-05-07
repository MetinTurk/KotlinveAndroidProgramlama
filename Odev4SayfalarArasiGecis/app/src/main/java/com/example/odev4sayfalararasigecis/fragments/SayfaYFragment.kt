package com.example.odev4sayfalararasigecis.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev4sayfalararasigecis.R
import com.example.odev4sayfalararasigecis.databinding.FragmentSayfaXBinding
import com.example.odev4sayfalararasigecis.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container , false)


        return binding.root
    }


}