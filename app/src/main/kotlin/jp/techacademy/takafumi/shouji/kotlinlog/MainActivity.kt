package jp.techacademy.takafumi.shouji.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1人目
        val firstHuman = Human("袖ケ浦 太郎",22, "野球")
        firstHuman.say()
        firstHuman.think()

        // 2人目
        val secondHuman = Human("川崎 花子",36, "音楽")
        secondHuman.say()
        secondHuman.think()
    }
}