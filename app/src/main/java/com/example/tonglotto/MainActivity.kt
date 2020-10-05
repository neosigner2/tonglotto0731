package com.example.tonglotto

import android.content.Intent
import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import com.example.tonglotto.ResultActivity
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() {


    var totalNum:Int = 0

    fun getRandomLottoNumber():Int {
        return Random().nextInt(45) +1
    }

    fun getRandomLottoNumbers(): MutableList<Int> {
        val lottoNumbers = mutableListOf<Int>()

        for(i in 1..6){
            val num = getRandomLottoNumber()
            totalNum += num
            println(totalNum)
            lottoNumbers.add(num)
        }
        return lottoNumbers
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //액션바 가리기
        supportActionBar?.hide()



        //일정시간동안 딜레이 하기, postDelayed안에 해당 함수 추가
        Handler().postDelayed({

            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))

            val failActivity = Intent(this,FailActivity::class.java)

            if (120 < totalNum){
                if (totalNum < 159){
                    startActivity(intent)
                }
                else{
                    startActivity(failActivity)
                }
            }
            else{
                startActivity(failActivity)
            }



        }, 3000)



    }


}
