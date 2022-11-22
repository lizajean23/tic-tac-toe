package com.example.tictactoe

import android.content.Intent
import android.media.AsyncPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    private lateinit var player1 : EditText
    private lateinit var player2 : EditText
    private lateinit var play : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar : ActionBar?= supportActionBar
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        player1 = findViewById(R.id.player1)
        player2 = findViewById(R.id.player2)
        play = findViewById(R.id.play)
        play.setOnClickListener{

            val firstPlayer : String = player1.text.toString()
            val secondPlayer : String = player2.text.toString()
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("PLAYER1" ,firstPlayer )
            intent.putExtra("PLAYER2" , secondPlayer)
            startActivity(intent)

        }

    }
}