package com.example.yalarbaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yalarbaapp.databinding.ActivityMainBinding
import com.example.yalarbaapp.searchresults.SearchResults

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SearchResults::class.java))
        }

    }

}