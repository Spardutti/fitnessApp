package com.example.fitnessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class EndFragment : Fragment() {
    lateinit var nextRoutine: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_end, container, false)

        nextRoutine = v.findViewById(R.id.next_routine)
        nextRoutine.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_endFragment_to_startFragment))

        return v
    }


}