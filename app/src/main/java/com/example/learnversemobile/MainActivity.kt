package com.example.learnversemobile

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        // Find the user identity TextView within the NavigationView (assuming it's inside the header)
        val navHeaderView = navigationView.getHeaderView(0) // Get the first header view
        val userIdentity: TextView = navHeaderView.findViewById(R.id.useridentity)  // Find TextView by ID

        if (userIdentity != null) {  // Check if TextView exists
            userIdentity.text = intent.getStringExtra("MESSAGE_KE")  // Set the text directly
        } else {
            // Handle case where TextView with ID "useridentity" is not found
            Log.w("MyActivity", "TextView 'useridentity' not found in NavigationView header")
        }

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,HomeFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_home)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        navController = findNavController(R.id.nav_host_fragment_container)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_home -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment()).commit()
            R.id.nav_settings -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, transcriptFragment()).commit()
            R.id.nav_share -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, documentFragment()).commit()
            R.id.nav_about -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AboutFragment()).commit()

            R.id.subPE -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()
            R.id.subContemporary -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()
            R.id.subLanguage -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()
            R.id.subMath -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()
            R.id.subPop -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()
            R.id.subSelf -> supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, SubjectFragment()).commit()

            R.id.nav_logout -> Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    @Deprecated("This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    override fun onBackPressed() {
        super.onBackPressed()

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
           drawerLayout.closeDrawer(GravityCompat.START)
       } else {
           onBackPressedDispatcher.onBackPressed()
       }
    }


}