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

        var superheroNames = ArrayList<String>()
        superheroNames.add("Wonder Woman")
        superheroNames.add("Batgirl")
        superheroNames.add("Daredevil")
        superheroNames.add("Thor")
        superheroNames.add("Superman")

        var wonderWomanImage =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.wonderwoman)
        var batGirlImage =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batgirl)
        var daredevilImage =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.daredevil)
        var thorImage = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.thor)
        var supermanImage =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)

        var superheroImages = ArrayList<Bitmap>()
        superheroImages.add(wonderWomanImage)
        superheroImages.add(batGirlImage)
        superheroImages.add(daredevilImage)
        superheroImages.add(thorImage)
        superheroImages.add(supermanImage)

        var manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager

        var adapter = HeroRecyclerAdapter(superheroNames, superheroImages)
        recyclerView.adapter = adapter
    }
}