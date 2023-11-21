package com.example.androidappcoffeeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CheckoutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CheckoutFragment : Fragment() {


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

//    private fun isValidInput(): Boolean {
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_checkout, container, false)
        val fullNumber = view.findViewById<EditText>(R.id.editText_fullName)
        val phone = view.findViewById<EditText>(R.id.editText_phoneNumber)
        val email = view.findViewById<EditText>(R.id.textEmailAddress)
        val address = view.findViewById<EditText>(R.id.editText_address)
        val city = view.findViewById<EditText>(R.id.editText_city)
        val cardNumber = view.findViewById<EditText>(R.id.editText_cardNumber)
        val cardHolderName = view.findViewById<EditText>(R.id.editText_cardholderName)
        val cvv = view.findViewById<EditText>(R.id.editText_cvv)
        val placeOrderButton = view.findViewById<Button>(R.id.button_placeOrder)
        setupTimePicker()
        placeOrderButton.setOnClickListener {
            if (isValidInput()) {
                navigateToNextPage()

            } else {
                Toast.makeText(activity, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            }

        }
        return view
    }

    private fun setupTimePicker() {
        val timePicker = view?.findViewById<TimePicker>(R.id.timePicker)
        timePicker?.setIs24HourView(true)
    }

    private fun navigateToNextPage() {
        //val intent = Intent(this, NextActivity::class.java)
        // startActivity(intent)
        // fragment next page navigation
        val fragmentTransaction = fragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.fragment_container, SummaryFragment())
        fragmentTransaction?.addToBackStack(null)
        fragmentTransaction?.commit()
    }

    private fun isValidInput(vararg field: EditText): Boolean {
        for (i in field) {
            if (i.text.toString().isEmpty()) {
                return false
            }
        }
        return true
    }
}