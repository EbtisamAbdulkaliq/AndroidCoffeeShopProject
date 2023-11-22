import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TimePicker
import android.widget.Toast
import com.example.androidappcoffeeshop.R
import com.example.androidappcoffeeshop.SummaryFragment

class CheckoutFragment : Fragment() {
    private lateinit var timePicker: TimePicker

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
        // Inflate the layouts
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


        timePicker = view.findViewById(R.id.timePicker)



        placeOrderButton.setOnClickListener {
            if (isValidInput(
                    fullNumber,
                    phone,
                    email,
                    address,
                    city,
                    cardNumber,
                    cardHolderName,
                    cvv
                )
            ) {
                navigateToNextPage()

            } else {
                Toast.makeText(activity, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
    private fun isValidInput(vararg fields: EditText): Boolean {
        return fields.all { it.text.isNotEmpty() == true }

    }

//    fun timepicker() {
//            val timePicker = view.findViewById<TimePicker>(R.id.timePicker)
//            val hour = timePicker.hour
//            val minute = timePicker.minute
//            val time = "$hour:$minute"
//            Toast.makeText(activity, time, Toast.LENGTH_SHORT).show()
//        }
//        return view
//    }



    fun navigateToNextPage() {
        val summaryFragment = SummaryFragment()

        // Pass data to the summary fragment
        val bundle = Bundle()
        bundle.putString("PICKUP_TIME", getTimeFromPicker())
        bundle.putString("ORDER_DETAILS", "Your order details here") // Replace with your logic
        summaryFragment.arguments = bundle

        val fragmentTransaction = parentFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, summaryFragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    private fun getTimeFromPicker(): String {
        val hour = timePicker.hour
        val minute = timePicker.minute
        return "$hour:$minute"
    }



}


//        private fun navigateToNextPage() {
//            //val intent = Intent(this, NextActivity::class.java)
//            // startActivity(intent)
//            // fragment next page navigation
//


