package com.example.androidappcoffeeshop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast



class OrdersFragment : Fragment() {
//    private lateinit var cappuccinoButton: Button
//    private lateinit var latteButton: Button
//private lateinit var espressoButton: Button
//    private lateinit var blondeRoastButton: Button
//    private lateinit var coffeeSizeRadioGroup: RadioGroup
    private lateinit var continueButton: Button
    private lateinit var extrasCheckboxes: List<CheckBox>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_orders, container, false)

        val cappuccinoButton = view.findViewById<Button>(R.id.cappuccino)
        val darkRoastButton = view.findViewById<Button>(R.id.DarkRoast)
        val blondeRoastButton = view.findViewById<Button>(R.id.button_blondeRoast)
        val espressoButton = view.findViewById<Button>(R.id.Espressobtn)
        continueButton = view.findViewById(R.id.continueButton)
        // cappuccinoButton = view.findViewById(R.id.cappuccino)
        extrasCheckboxes = listOf(
            view.findViewById(R.id.checkbox_cream),
            view.findViewById(R.id.checkbox_whole_milk),
            view.findViewById(R.id.checkbox_non_fat_milk),
            view.findViewById(R.id.checkbox_extra_shot),
        )
        //   val creamcheckbox = view.findViewById<CheckBox>(R.id.checkbox_cream)
        // val WoleMilkcheckBox = view.findViewById<CheckBox>(R.id.checkbox_whole_milk)
        //  val nonFatcheckBox = view.findViewById<CheckBox>(R.id.checkbox_non_fat_milk)

        //  val espressoButton = view.findViewById<Button>(R.id.Espressobtn)


        //coffee type bottuns
        //list
        val coffeeTypeButton =
            listOf(cappuccinoButton, darkRoastButton, blondeRoastButton, espressoButton)
        coffeeTypeButton.forEach { button ->
            button.setOnClickListener {
                Toast.makeText(requireContext(), button.text, Toast.LENGTH_SHORT).show()


            }
        }
        //continue button
//                 continueButton.setOnClickListener {
//             val selectedExtras = extrasCheckboxes.filter { it.isChecked }.map { it.text.toString() }
//  val message = if (selectedExtras.isNotEmpty()) {
////             if (checkbox.isChecked) {
////                    selectedExtras.add(checkbox.text.toString())
////                }
////            }
//            val message = if (selectedExtras.isNotEmpty()){
//                "You have selected: ${selectedExtras.joinToString(", ")}"
//            } else {
//                "You have selected no extras"
//        }
//Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
//
//
//          }
//            return view
//        })
//    })}

        continueButton.setOnClickListener {
            val selectedExtras = extrasCheckboxes.filter { it.isChecked }.map { it.text.toString() }
            val message = if (selectedExtras.isNotEmpty()) {
                "You have selected: ${selectedExtras.joinToString(", ")}"
            } else {
                "You have selected no extras"
            }
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

            // Navigation or additional actions here
        }

        return view
    }
    // ... other class methods
}
//        cappuccinoButton.setOnClickListener(View.OnClickListener {
//
//       Toast.makeText(requireContext(), "Cappuccino", Toast.LENGTH_SHORT).show()
//       //  }
//
//          darkRoastButton.setOnClickListener {
//        Toast.makeText(requireContext(), "darkRoast", Toast.LENGTH_SHORT).show()
//         }
////
//         blondeRoastButton.setOnClickListener {
//
//      Toast.makeText(requireContext(), "Latte", Toast.LENGTH_SHORT).show()
//
//        // }
//         espressoButton.setOnClickListener(View.OnClickListener {
//       Toast.makeText(requireContext(), "Espresso", Toast.LENGTH_SHORT).show()
//
//         })






