package com.dd.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello World!")
        println("My name is Ritesh Kumar Sinha")

        val sinha = "Ritesh Sinha"
        val ritesh = "Ritesh Kumar Sinha"
        println(ritesh)

        val riteshWeeklySalary = 32
        val riteshMonthlySalary = 32 * 4
        println("$ritesh weekly salary is $riteshWeeklySalary")
        println("$ritesh monthly salary is $riteshMonthlySalary")

        val apples = 6
        val oranges = 5
        val fruits = apples - oranges
        println("Remaining fruits is $fruits")
        println(apples / 4)
        println("Other person name is $sinha")

        println("A quater of the apple is ${apples / 4}")

        val weeks = 130
        val years: Double = weeks / 52.0
        println("$weeks weeks is $years years ")

        println("My name is $ritesh")
    }
}