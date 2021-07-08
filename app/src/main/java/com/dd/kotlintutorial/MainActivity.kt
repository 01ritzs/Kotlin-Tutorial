package com.dd.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello World!")
        println("My name is Ritesh Kumar Sinha")

        var ritesh: String = "Ritesh Kumar Sinha"
        println(ritesh)

        var riteshWeeklySalary: Int = 32
        var riteshMonthlySalary: Int = 32 * 4
        println("Ritesh weekly salary is $riteshWeeklySalary")
        println("Ritesh monthly salary is $riteshMonthlySalary")

        val apples: Int = 6
        val oranges: Int = 5
        var fruits = apples - oranges
        println("Remaining fruits is $fruits")
        println(apples / 4)

        println("A quater of the apple is ${apples / 4}")

        val weeks: Int = 130
        val years: Double = weeks / 52.0
        println("$weeks weeks is $years years ")

        println("My name is $ritesh")
    }
}