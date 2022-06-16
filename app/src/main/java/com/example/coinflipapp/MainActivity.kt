package com.example.coinflipapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coinFlip: Button = findViewById(R.id.flip_button)
        val coinImage: ImageView = findViewById(R.id.coin_image)

        coinFlip.setOnClickListener {
            flipTheCoin(coinImage)
        }
    }

    private fun flipTheCoin(imageView: ImageView) {

        when ((1..2).random()) {
            1 -> imageView.setImageResource(R.drawable.kopf)
            2 -> imageView.setImageResource(R.drawable.zahl)
        }
    }
}
