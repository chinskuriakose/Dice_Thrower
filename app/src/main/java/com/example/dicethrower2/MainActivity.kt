package com.example.dicethrower2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.logging.Logger
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    companion object {
        private val logger = Logger.getLogger(MainActivity::class.java.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)

        rollButton.setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        val diceImage = findViewById<ImageView>(R.id.imageView)
        val resultText = findViewById<TextView>(R.id.resultTextView)

        var randint = Random.nextInt(1,6)
        logger.info("randInt = $randint")
        when (randint) {
            1 -> {
                diceImage.setImageResource(R.drawable.dice_1)
                resultText.setText("One")
            }
            2 -> {
                diceImage.setImageResource(R.drawable.dice_2)
                resultText.setText("Two")
            }
            3 -> {
                diceImage.setImageResource(R.drawable.dice_3)
                resultText.setText("Three")
            }
            4 -> {
                diceImage.setImageResource(R.drawable.dice_4)
                resultText.setText("Four")
            }
            5 -> {
                diceImage.setImageResource(R.drawable.dice_5)
                resultText.setText("Five")
            }
            6 -> {
                diceImage.setImageResource(R.drawable.dice_6)
                resultText.setText("Six")
            }
        }
    }
}