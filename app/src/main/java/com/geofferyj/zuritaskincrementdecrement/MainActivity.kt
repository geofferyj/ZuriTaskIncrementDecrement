package com.geofferyj.zuritaskincrementdecrement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMinus : Button = findViewById(R.id.button_minus)
        val btnPlus : Button = findViewById(R.id.button_plus)
        val result: TextView = findViewById(R.id.result_txt)

        btnMinus.setOnClickListener{
            val num = result.text.toString()
            result.text = decreaseCount(num)
        }

        btnPlus.setOnClickListener{
            val num = result.text.toString()
            result.text = increaseCount(num)
        }
    }

    private fun increaseCount(num: String): String{
        return (num.toInt() + 1).toString()
    }

    private fun decreaseCount(num: String): String{
        return (num.toInt() - 1).toString()

    }

}