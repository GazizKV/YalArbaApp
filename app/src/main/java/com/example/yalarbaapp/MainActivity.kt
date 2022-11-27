package com.example.yalarbaapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.yalarbaapp.searchresults.SearchResults

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchButton = findViewById<ImageButton>(R.id.search_button)
        searchButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SearchResults::class.java))
        }
    }

}