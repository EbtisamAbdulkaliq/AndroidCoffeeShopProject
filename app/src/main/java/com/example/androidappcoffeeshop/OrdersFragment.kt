package com.example.androidappcoffeeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup

class OrdersFragment : Fragment() {
    lateinit var coffeeSizeRadioGroup: RadioGroup
    lateinit var continueButton: Button
    lateinit var extrasCheckboxes: List<CheckBox>
    // override fun onCreate(savedInstanceState: Bundle?) {
      //  super.onCreate(savedInstanceState)



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        continueButton = view.findViewById(R.id.checkbox_cream)


    }

    }
