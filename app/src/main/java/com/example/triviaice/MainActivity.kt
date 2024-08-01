package com.example.triviaice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Gen Knowledge - https://opentdb.com/api.php?amount=5&category=9&difficulty=easy&type=multiple
        //Movies - https://opentdb.com/api.php?amount=5&category=11&difficulty=easy&type=multiple
        //Games - https://opentdb.com/api.php?amount=5&category=15&difficulty=easy&type=multiple

        var btnGenKnowledge = findViewById<Button>(R.id.btnGenKnowledge)
        var btnFilms = findViewById<Button>(R.id.btnFilms)
        var btnGames = findViewById<Button>(R.id.btnGames)

        btnGenKnowledge.setOnClickListener {
            val intent = Intent(this, GenKnowledge::class.java)
            startActivity(intent)
        }
        btnFilms.setOnClickListener {
            val intent = Intent(this, Films::class.java)
            startActivity(intent)
        }
        btnGames.setOnClickListener {
            val intent = Intent(this, Games::class.java)
            startActivity(intent)
        }

    }


}
