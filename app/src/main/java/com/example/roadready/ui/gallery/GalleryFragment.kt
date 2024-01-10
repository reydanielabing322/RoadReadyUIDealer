package com.example.roadready.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.roadready.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    private var binding: FragmentGalleryBinding? = null
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)
        binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}