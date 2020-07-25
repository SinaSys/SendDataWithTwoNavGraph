package com.example.senddatawithtwonavgraph

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var navController: NavController


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)


        btn_send_data.setOnClickListener {

            val direction = FirstFragmentDirections.actionFirstFragmentToSecondNavGraph(et_content.text.toString())
            navController.navigate(direction)

        }
    }
}
