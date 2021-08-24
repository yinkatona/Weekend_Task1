package com.example.weekend_task1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton: Button = findViewById(R.id.image_button)
        val  displayImage : ImageView = findViewById(R.id.image_view)

        val view: View = findViewById(R.id.layout_view)


        displayImage.visibility = View.INVISIBLE

        imageButton.setOnClickListener {
            displayImage.visibility = View.VISIBLE

            view.setBackgroundColor(Color.DKGRAY)


        }

    }
}