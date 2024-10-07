package com.example.car_proximity_app_android

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class UserProfileActivity:AppCompatActivity() {


     lateinit var UsernameInput: EditText
     lateinit var PasswordInput: EditText
     lateinit var LoginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)


        UsernameInput = findViewById(R.id.username_input)
        PasswordInput = findViewById(R.id.password_input)
        LoginButton = findViewById(R.id.login_btn)

        LoginButton.setOnClickListener {
            val Username = UsernameInput.text.toString()
            val Password = PasswordInput.text.toString()
            Log.i("Test Credential", "Username: $Username, Password: $Password")
        }

    }
}



