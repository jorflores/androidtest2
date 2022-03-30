package com.example.intents_a

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents_a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {


            val nombre = binding.editTextTextPersonName.text.toString()

            val intent = Intent(this,PantallaB::class.java)
            intent.putExtra("nombre",nombre)

            this.startActivity(intent)

        }


        binding.button2.setOnClickListener {


             val SEARCH_PREFIX = "https://www.google.com/search?q=" + binding.editTextSearch.text.toString()
            val queryUrl: Uri = Uri.parse(SEARCH_PREFIX)

            val intent = Intent(Intent.ACTION_VIEW,queryUrl)
            this.startActivity(intent)



        }

        binding.button3.setOnClickListener {





        }


    }



}