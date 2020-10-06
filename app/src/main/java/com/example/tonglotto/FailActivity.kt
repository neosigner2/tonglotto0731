package com.example.tonglotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_result.*

class FailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)
        supportActionBar?.hide()

        finishButton.setOnClickListener {
            finishApp()
            Toast.makeText(this, "토스트 메세지 띄우기 입니다.", Toast.LENGTH_LONG).show()
        }
    }

    fun finishApp(){
        ActivityCompat.finishAffinity(this)
        System.exit(0);
    }
}
