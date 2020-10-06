package com.example.tonglotto

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animation.*

class Animation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_animation)
        supportActionBar?.hide()
        fun startActivity(activity: Activity) {
            activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        }


    }


}
