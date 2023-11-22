package com.example.androidappcoffeeshop

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SummaryFragment :
    Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_summary, container, false)

        // Retrieve data from arguments
        val pickupTime = arguments?.getString("PICKUP_TIME")
        val orderDetails = arguments?.getString("ORDER_DETAILS")

        // Find TextViews
        val textViewPickupTime = view.findViewById<TextView>(R.id.textViewPickupTime)
        val textViewOrderDetails = view.findViewById<TextView>(R.id.textViewOrderDetails)

        // Set data to TextViews
        textViewPickupTime.text = "Pickup Time: $pickupTime"
        textViewOrderDetails.text = "Order Details: $orderDetails"

        return view
    }
}


