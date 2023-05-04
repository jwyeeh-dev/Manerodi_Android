package com.example.manerodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ellipse1Button = findViewById<View>(R.id.view_ellipse_1)
        ellipse1Button.setOnClickListener {
            val intent = Intent(this, SchoolSelectionActivity::class.java)
            startActivity(intent)
        }

    }
}