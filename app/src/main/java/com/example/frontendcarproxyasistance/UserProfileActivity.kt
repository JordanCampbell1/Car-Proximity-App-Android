package com.example.frontendcarproxyasistance

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class UserProfileActivity:AppCompatActivity() {
    private lateinit var userNameInput: EditText
    private lateinit var passWordInput: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        userNameInput = findViewById(R.id.username_input)
        passWordInput = findViewById(R.id.password_input)
        loginButton = findViewById(R.id.login_btn)

        loginButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val password = passWordInput.text.toString()
            // Perform login logic here
            Log.i("Test Credential","Username: $username Password: $password" )
        }


    }
}