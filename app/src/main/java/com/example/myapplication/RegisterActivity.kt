package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etuserame:EditText
    private lateinit var etpassword:EditText
    private lateinit var etconfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etuserame = findViewById(R.id.edt_username)
        etpassword = findViewById(R.id.edt_password)
        etconfirmPassword = findViewById(R.id.edt_confirm_password)

        val btnRegister:Button = findViewById(R.id.btn_Register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Register -> {

                var bundel = Bundle()
                bundel.putString("username", etuserame.text.toString())
                bundel.putString("password",etpassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundel)
                startActivity(intent)
            }
        }
    }
}