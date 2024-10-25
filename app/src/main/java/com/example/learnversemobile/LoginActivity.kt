package com.example.learnversemobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var loginButton: Button
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var welcomeUser: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.loginButton)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)


        val usernameText = username.text
        val passwordText = password.text

        val startMainMenu = Intent(this,  MainActivity::class.java)

        loginButton.setOnClickListener{
            if (usernameText.toString() == "admin" && passwordText.toString() == "admin") {
                startMainMenu.putExtra("MESSAGE_KE", usernameText.toString())
                startActivity(startMainMenu)
            }
        }





//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}