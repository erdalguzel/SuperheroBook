package com.example.superherobook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_representation.*

class RepresentationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_representation)

        val intent = intent
        val name = intent.getStringExtra("charName")
        textView.text = name
        val hero = SingletonClass.image
        heroImageView.setImageBitmap(hero)
    }
}