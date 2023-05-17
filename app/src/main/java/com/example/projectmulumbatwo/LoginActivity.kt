package com.example.projectmulumbatwo

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var tvTitleLog: TextView
    lateinit var tvSignin: TextView
    lateinit var edtEmail: EditText
    lateinit var edtPasswaad: EditText
    lateinit var btnLogin: Button
    lateinit var auth: FirebaseAuth
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvTitleLog = findViewById(R.id.mTvwelcome)
        tvSignin = findViewById(R.id.mTvSignIn)
        edtEmail = findViewById(R.id.mEdtEmails)
        edtPasswaad = findViewById(R.id.mEdtPasswaads)
        btnLogin = findViewById(R.id.mBtnSignIns)
        auth = FirebaseAuth.getInstance()
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Logging you in")
        progressDialog.setMessage("Please wait...")

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPasswaad.text.toString().trim()

            if (email.isEmpty()) {
                edtEmail.setError("Please fill out this field!")
                edtEmail.requestFocus()
            } else if (password.isEmpty()) {
                edtPasswaad.setError("Please fill out this field!")
                edtPasswaad.requestFocus()
            }

            progressDialog.show()
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                progressDialog.dismiss()
                if (it.isSuccessful) {
                    Toast.makeText(
                        this, "Welcome back" + "You are back to being a shopster",
                        Toast.LENGTH_LONG
                    ).show()

                    //Firebase Registered User
                    var enda = Intent(this, MainActivity::class.java)
                    startActivity(enda)
                    finish()

                } else {
                    Toast.makeText(
                        this, "User Login Failed",
                        Toast.LENGTH_LONG
                    ).show()


                }
            }

        }
    }
}
