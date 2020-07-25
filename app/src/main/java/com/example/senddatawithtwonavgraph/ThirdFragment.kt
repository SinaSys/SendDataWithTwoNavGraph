package com.example.senddatawithtwonavgraph

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs


class ThirdFragment : Fragment(R.layout.fragment_third) {

    private val args: ThirdFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val value = args.foo
        Toast.makeText(requireContext(), value, Toast.LENGTH_LONG).show()
    }


}
