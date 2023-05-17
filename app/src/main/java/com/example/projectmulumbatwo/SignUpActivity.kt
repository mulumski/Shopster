package com.example.projectmulumbatwo

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {
    lateinit var mTvtitle : TextView
    lateinit var mEdtName : EditText
    lateinit var mEdtEmail : EditText
    lateinit var mEdtPhone : EditText
    lateinit var mEdtPsswd : EditText
    lateinit var mTvInfo: TextView
    lateinit var mBtnSignin: Button
    lateinit var mBtnSignup : Button
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        mTvtitle = findViewById(R.id.mtvttlone)
        mEdtName = findViewById(R.id.mEdtName)
        mEdtEmail = findViewById(R.id.mEdtEmail)
        mEdtPhone = findViewById(R.id.mEdtPhone)
        mEdtPsswd = findViewById(R.id.mEdtPasssword)
        mTvInfo = findViewById(R.id.mTvalracc)
        mBtnSignin = findViewById(R.id.mBtnsignin)
        mBtnSignup = findViewById(R.id.mBtnSignUp)
        progressDialog=ProgressDialog(this)
        progressDialog.setTitle("Signing Up...")
        progressDialog.setMessage("Please wait...")


        mBtnSignin.setOnClickListener{
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        mBtnSignup.setOnClickListener{
            var name = mEdtName.text.toString().trim()
            var email = mEdtEmail.text.toString().trim()
            var phone = mEdtPhone.text.toString().trim()
            var password = mEdtPsswd.text.toString().trim()
            var id = System.currentTimeMillis().toString()

            if (name.isEmpty()){
                mEdtName.setError("Please fill out this field!")
                mEdtName.requestFocus()
            }else if (email.isEmpty()){
                mEdtEmail.setError("Please fill out this field!")
                mEdtEmail.requestFocus()
            }else if (password.isEmpty()){
                mEdtPsswd.setError("Please fill out this field!")
                mEdtPsswd.requestFocus()
            }else if (phone.isEmpty()){
                mEdtPhone.setError("Please fill out this field!")
                mEdtPsswd.requestFocus()
            }else{
                //Proceed to save
                var user = User(name, email, phone, password, id)
                //Create a reference to firebase database
                var ref = FirebaseDatabase.getInstance().getReference().
                child("Users"+id)

                progressDialog.show()
                ref.setValue(user).addOnCompleteListener{
                    progressDialog.dismiss()
                    if (it.isSuccessful){
                        Toast.makeText(this, "Welcome $name you are now a Shopster!",
                            Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this, "User saving Failed",
                            Toast.LENGTH_LONG).show()

                    }
                }
                var intent =  Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


        }
    }

}
