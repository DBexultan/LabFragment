package com.example.fragmentlabbek.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.fragmentlabbek.R
import kotlinx.android.synthetic.main.fragment_b.view.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentB : Fragment() {

    var displayMessage: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        displayMessage = arguments?.getString("message")

        view.displayMessage.text = displayMessage

        return view
    }

}
