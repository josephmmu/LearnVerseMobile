package com.example.learnversemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val composeView = view.findViewById<ComposeView>(R.id.compose_view2)

        //val data = arguments
        //val fName = data!!.getString("fNameKey").toString()

        composeView.setContent {
            displayAccount("Student",123123123,'M',"2002/08/20",22, 3, "BSIT")
        }

        return view
    }

    companion object {
        lateinit var arguments: Bundle

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AboutFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }


    @Composable
    fun displayAccount(
        accountType: String,
        //name: String,
        id: Int,
        gender: Char,
        dob: String,
        age: Int,
        yrL: Int,
        course: String,

    ) {
        Column(modifier = Modifier.padding(20.dp,30.dp)) {
            Image(
                painter = painterResource(id = R.drawable.baseline_person_24),
                contentDescription = null,
                modifier = Modifier.size(300.dp),

            )

            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Account Type: " + accountType)
            //JosephText(text = "Name: " + name)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "ID: " + id)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Gender: " + gender)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Date of Birth: " + dob)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Age: " + age)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Year Level: " + yrL)
            Text(modifier = Modifier.padding(20.dp,10.dp), text = "Course" + course)

        }
    }
}