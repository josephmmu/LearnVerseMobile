package com.example.learnversemobile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.findNavController
import com.example.learnversemobile.databinding.FragmentHomeBinding
import com.google.android.material.navigation.NavigationView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Call the function to set up click listeners for multiple ImageViews
        setupClickListeners(
            binding.cardLanguage,
            binding.pecard, // Replace with your actual ImageView IDs
            binding.contemporarycard,  // Add as many as you need
            binding.mathcard,
            binding.popcard,
            binding.udnerstandingcard,
        )
        return binding.root
    }



    private fun setupClickListeners(vararg imageViews: ImageView) {
        val context = requireContext()

        for (imageView in imageViews) {
            imageView.setOnClickListener {
                val intent = Intent(context, MainActivity2::class.java)
                startActivity(intent)

                val navigationView = activity?.findViewById<NavigationView>(R.id.nav_view)

                when (imageView) {
                    binding.cardLanguage -> {
                        navigationView?.setCheckedItem(R.id.subLanguage)
                    }
                    binding.pecard -> {
                        navigationView?.setCheckedItem(R.id.subPE) // Example: select "Home"
                    }
                    binding.contemporarycard -> {
                        navigationView?.setCheckedItem(R.id.subContemporary) // Example: select "Settings"
                    }
                    binding.mathcard -> {
                        navigationView?.setCheckedItem(R.id.subMath) // Example: select "Settings"
                    }
                    binding.popcard -> {
                        navigationView?.setCheckedItem(R.id.subPop) // Example: select "Settings"
                    }
                    binding.udnerstandingcard -> {
                        navigationView?.setCheckedItem(R.id.subSelf) // Example: select "Settings"
                    }
                    // Add more cases as needed
                }
            }
        }
    }
}