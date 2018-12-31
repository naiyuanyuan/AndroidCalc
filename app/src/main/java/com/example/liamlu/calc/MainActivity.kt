package com.example.liamlu.calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    public fun myPlus(view: View) {
        val one = numberOne.text.toString().toDouble()
        val two = numberTwo.text.toString().toDouble()

        result.text = myplus(one, two).toString()
    }

    public fun myMinus(view: View) {
        val one = numberOne.text.toString().toDouble()
        val two = numberTwo.text.toString().toDouble()
        result.text = myminus(one, two).toString()
    }

    public fun myMultiply(view: View) {
        val one = numberOne.text.toString().toDouble()
        val two = numberTwo.text.toString().toDouble()
        result.text = mymultiply(one, two).toString()
    }

    public fun myDivide(view: View) {
        val one = numberOne.text.toString().toDouble()
        val two = numberTwo.text.toString().toDouble()
        result.text = mydivide(one, two).toString()
    }

    private fun myplus(one: Double, two: Double): Double {
        return one + two

    }

    private fun myminus(one: Double, two: Double): Double {
        return one - two

    }

    private fun mymultiply(one: Double, two: Double): Double {
        return one * two
    }

    private fun mydivide(one: Double, two: Double): Double {
        return one / two
    }


}

