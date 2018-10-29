package com.example.tic_tac

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val buttons = listOf(listOf(button00,button01,button02),
                             listOf(button10,button11,button12),
                             listOf(button20,button21,button22))
        var x = 0
        fun clickFun(button: Button) {

            if (button.tag=="0") {
                button.tag = "1"
                if (x % 2 == 0)
                    button.text = "X"
                else
                    button.text = "O"



                if ((button00.text == button11.text && button11.text == button22.text) ||
                        (button02.text == button11.text && button11.text == button20.text) ||
                        (button00.text == button01.text && button01.text == button02.text) ||
                        (button10.text == button11.text && button11.text == button12.text) ||
                        (button20.text == button21.text && button21.text == button22.text)) {

                    if (x % 2 == 0) {
                        println("X wins")
                        winText.text = "palyer 1 wins"

                    } else {
                        println("O wins")
                        winText.text = "palyer 2 wins"
                    }

                }
                else {
                    if (x == 8)
                        winText.text = "Draw!!!"
                }
                x++


            }



        }


        button00.setOnClickListener(){
            clickFun(button00)
        }
        button01.setOnClickListener(){
            clickFun(button01)
        }
        button02.setOnClickListener(){
            clickFun(button02)
        }
        button22.setOnClickListener(){
            clickFun(button22)
        }
        button10.setOnClickListener(){
            clickFun(button10)
        }
        button11.setOnClickListener(){
            clickFun(button11)
        }
        button12.setOnClickListener(){
            clickFun(button12)
        }
        button20.setOnClickListener(){
            clickFun(button20)
        }
        button21.setOnClickListener(){
            clickFun(button21)
        }




    }
}
