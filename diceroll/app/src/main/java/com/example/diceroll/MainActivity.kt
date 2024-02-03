package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton:Button=findViewById(R.id.roll_button)
        rollbutton.setOnClickListener {
            //Toast.makeText(this,"dice is rolled", Toast.LENGTH_SHORT).show()
            rolldice()
        }
        image=findViewById(R.id.dice_image)
    }
    private fun rolldice(){
        val value=Random().nextInt(6)+1
       val photo= when(value){
            1->R.drawable.dice_1
           2->R.drawable.dice_2
           3->R.drawable.dice_3
           4->R.drawable.dice_4
           5->R.drawable.dice_5
           else->R.drawable.dice_6
        }

        image.setImageResource(photo)

    }
}