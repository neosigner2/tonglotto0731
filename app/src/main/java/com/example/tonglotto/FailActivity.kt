package com.example.tonglotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)
        supportActionBar?.hide()
    }
}
