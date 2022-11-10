package com.example.tictactoe

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var board: Array<Array<Button>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val resetBtn = findViewById<View>(R.id.resetBtn) as Button

        board= arrayOf(
            arrayOf(button1,button2,button3),
            arrayOf(button4,button5,button6),
            arrayOf(button7,button8,button9)
        )

        for(i in board){
          for(button in i){
            button.setOnClickListener(this)
          }
        }

        resetBtn.setOnClickListener{

        }

    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}