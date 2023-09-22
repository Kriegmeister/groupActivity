package com.example.groupactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textUsername = findViewById<TextView>(R.id.txtUsername)
        var editUsername = findViewById<EditText>(R.id.edtUsername)

        var textPassword = findViewById<TextView>(R.id.txtPassword)
        var editPassword = findViewById<EditText>(R.id.edtPassword)

        var buttonLogin = findViewById<Button>(R.id.btnLogIn)

        var textRegister = findViewById<TextView>(R.id.txtRegister)
        var textName = findViewById<TextView>(R.id.txtName)
        var editName = findViewById<EditText>(R.id.edtName)
        var textSection = findViewById<TextView>(R.id.txtSection)
        var editSection = findViewById<EditText>(R.id.edtSection)
        var textUserReg = findViewById<TextView>(R.id.txtUsrN)
        var editUserReg = findViewById<EditText>(R.id.edtUsrN)
        var textPass = findViewById<TextView>(R.id.txtPass)
        var editPass = findViewById<EditText>(R.id.edtPass)


        var buttonRegister = findViewById<Button>(R.id.btnRegister)

        buttonRegister.setOnClickListener{
            try {
                if (!editUsername.text.toString().isNullOrEmpty() &&
                    !editSection.text.toString()) {
                }


            } catch(e:Exception) {
                Log.e("error", e.message.toString())
            }
        }
    }



}