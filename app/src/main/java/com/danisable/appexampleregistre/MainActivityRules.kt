package com.danisable.appexampleregistre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_rules.*

class MainActivityRules : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_rules)

        btParentActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btParentActivity -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}