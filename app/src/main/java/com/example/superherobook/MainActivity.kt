package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroNames = ArrayList<String>()
        superheroNames.add("Wonder Woman")
        superheroNames.add("Batgirl")
        superheroNames.add("Daredevil")
        superheroNames.add("Thor")
        superheroNames.add("Superman")


        val drawableList = ArrayList<Int>()

        val wonderwomanDrawable = R.drawable.wonderwoman
        val batgirlDrawable = R.drawable.batgirl
        val daredevilDrawable = R.drawable.daredevil
        val thorDrawable = R.drawable.thor
        val supermanDrawable = R.drawable.superman

        drawableList.add(wonderwomanDrawable)
        drawableList.add(batgirlDrawable)
        drawableList.add(daredevilDrawable)
        drawableList.add(thorDrawable)
        drawableList.add(supermanDrawable)

        var manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager

        var adapter = HeroRecyclerAdapter(superheroNames, drawableList)
        recyclerView.adapter = adapter
    }
}