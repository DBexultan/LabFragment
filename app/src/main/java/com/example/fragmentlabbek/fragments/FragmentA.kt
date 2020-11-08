package com.example.fragmentlabbek.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentlabbek.Communocator

import com.example.fragmentlabbek.R
import kotlinx.android.synthetic.main.fragment_a.view.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentA : Fragment() {

    private lateinit var communocator: Communocator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        communocator = activity as Communocator

        view.sendBtn.setOnClickListener {
            communocator.passDataCom(view.messageInput.text.toString())
        }
        return view
    }

}
