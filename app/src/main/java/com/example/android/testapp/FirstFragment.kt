package com.example.android.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.viewbinding.library.fragment.viewBinding
import com.example.android.testapp.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

   //    private var _binding: FragmentFirstBinding? = null
   //    private val binding get() = _binding!!

    private val binding: FragmentFirstBinding by viewBinding()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = "Minyu Kim"
    }

    //  override fun onDestroyView() {
 //      super.onDestroyView()
 //   _binding = null
 //
    }