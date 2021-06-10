package com.danisable.appexampleregistre

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEmpty.setOnClickListener(this)
        btAge.setOnClickListener(this)
        btShowData.setOnClickListener(this)
        btNewActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btNewActivity -> {
                startActivity(Intent(this,MainActivityRules::class.java))
            }
            R.id.btShowData -> {
                val name  = etName.text.toString()
                val pass  = etPass.text.toString()
                val email  = etEmail.text.toString()
                val phone  = etPhone.text.toString()
                Log.e("TAG", "Name: $name, Pass: $pass, Email: $email, Phone: $phone")
            }
            R.id.btAge -> {
                if(etAge.text.toString().isNotEmpty()) {
                    var age = etAge.text.toString().toInt()
                    if (age >= 18) {
                        Toast.makeText(this, "Es mayor de Edad", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Es menor de Edad", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    etAge.error = "Empty"
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