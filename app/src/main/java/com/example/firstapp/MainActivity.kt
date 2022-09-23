package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scorelabelteamA :TextView = findViewById(R.id.Team_a_score)
        val scorelabelteamB :TextView = findViewById(R.id.Team_b_score)

        val addthreepointsteamA :Button = findViewById(R.id.adding_3)
        val addthreepointsteamB :Button = findViewById(R.id.adding_3b)

        val addtwopointsteamA :Button = findViewById(R.id.adding_2)
        val addtwopointsteamB :Button = findViewById(R.id.adding_2b)

        val reset :Button = findViewById(R.id.reset)


        addthreepointsteamA.setOnClickListener{
            val currentscore = scorelabelteamA.text.toString().toInt()
            val newscore= currentscore+3
            scorelabelteamA.text = "$newscore"
        }
        addthreepointsteamB.setOnClickListener{
            val currentscore = scorelabelteamB.text.toString().toInt()
            val newscore= currentscore+3
            scorelabelteamB.text = "$newscore"
        }
        addtwopointsteamA.setOnClickListener{
            val currentscore = scorelabelteamA.text.toString().toInt()
            val newscore= currentscore+2
            scorelabelteamA.text = "$newscore"
        }
        addtwopointsteamB.setOnClickListener{
            val currentscore = scorelabelteamB.text.toString().toInt()
            val newscore= currentscore+2
            scorelabelteamB.text = "$newscore"
        }



        reset.setOnClickListener{
            scorelabelteamA.text="0"
            scorelabelteamB.text="0"
        }












    }
}



