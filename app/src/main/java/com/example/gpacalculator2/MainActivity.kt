package com.example.gpacalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button4.setOnClickListener{
            val bb=nb.text.toString().toInt()
            val by=nb2.text.toString().toInt()
            val ba=nb3.text.toString().toInt()
            val bc=nb4.text.toString().toInt()
            val bd=nb5.text.toString().toInt()
            val total = bb+by+ba+bc+bd
            tv1.setText("$total")
            val b=p1.text.toString().toInt()
            val d=p2.text.toString().toInt()
            val a=p3.text.toString().toInt()
            val q=p4.text.toString().toInt()
            val w=p5.text.toString().toInt()
            val gpa = (b*bb) + (d*by) + (a*ba) + (q*bc) + (w*bd)
            val gp = gpa / total
            tv2.setText("$gp")
        }
        button5.setOnClickListener{
            nb.setText("")
            nb2.setText("")
            nb3.setText("")
            nb4.setText("")
            nb5.setText("")
            p1.setText("")
            p2.setText("")
            p3.setText("")
            p4.setText("")
            p5.setText("")

        }
    }
}