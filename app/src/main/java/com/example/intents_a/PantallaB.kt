package com.example.intents_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents_a.databinding.ActivityMainBinding
import com.example.intents_a.databinding.ActivityPantallaBBinding

class PantallaB : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaBBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val nombre = intent?.extras?.getString("nombre")

        binding.textView2.text = nombre

    }
}