package com.dd.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val lives = 3
//        if (lives < 1) {
//            println("Game Over!")
//        }

        println("How old are you?")
        val age = readLine()!!.toInt()
        println("age is $age")

        val message: String = when {
            age < 18 -> "You are not eligible"
            age == 100 -> "Congratulation"
            else -> "You can vote"
        }
        println(message)
    }
}