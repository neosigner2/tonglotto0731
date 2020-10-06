package com.example.tonglotto
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.tonglotto.R
import kotlinx.android.synthetic.main.activity_result.*
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {

    val lottoImageStartId = R.drawable.ball_01




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()

        val result = intent.getIntegerArrayListExtra("result")
        result?.let {
            updateLottoBallImage(result.sortedBy { it })
        }

        finishButton.setOnClickListener {
            finishApp()
            Toast.makeText(this, "토스트 메세지 띄우기 입니다.", Toast.LENGTH_LONG).show()
        }


    }

    fun updateLottoBallImage(result: List<Int>){
        if(result.size < 6) return

        imageView1.setImageResource(lottoImageStartId + (result[0] - 1))
        imageView2.setImageResource(lottoImageStartId + (result[1] - 1))
        imageView3.setImageResource(lottoImageStartId + (result[2] - 1))
        imageView4.setImageResource(lottoImageStartId + (result[3] - 1))
        imageView5.setImageResource(lottoImageStartId + (result[4] - 1))
        imageView6.setImageResource(lottoImageStartId + (result[5] - 1))


    }

    fun finishApp(){
        ActivityCompat.finishAffinity(this)
        System.exit(0);
    }
}
