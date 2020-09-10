package com.example.superherobook

import android.graphics.Bitmap

class SingletonClass {

    companion object ChosenHero {
        // Holds image of clicked row
        var image: Bitmap? = null
    }
}