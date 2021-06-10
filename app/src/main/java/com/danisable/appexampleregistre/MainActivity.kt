package com.danisable.appexampleregistre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.get
import androidx.core.view.isEmpty
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log.e as e1

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEmpty.setOnClickListener(this)
        btAge.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btShowData -> {
                val name  = etName.text
                var pass  = etPass.text
                var email  = etEmail.text
                var phone  = etPhone.text
                Log.e("TAG", "Name: $name, Pass: $pass, Email: $email, Phone: $phone")
            }
            R.id.btAge -> {
                var age  = etAge.text.toString().toInt()
                if(age > 18){
                    Toast.makeText(this,  "Es mayor de Edad", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.btEmpty -> {
                if(etName.text.toString().isEmpty() ){
                    etName.error = "Empty"
                }

                if(etPass.text.toString().isEmpty() ){
                    etPass.error = "Empty"
                }

                if(etEmail.text.toString().isEmpty() ){
                    etEmail.error = "Empty"
                }

                if(etPhone.text.toString().isEmpty() ){
                    etPhone.error = "Empty"
                }

            }
        }
    }
}