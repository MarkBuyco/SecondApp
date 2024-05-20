package com.example.secondapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView

class AntMan1 : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ant_man1)

        videoView = findViewById(R.id.videoView)

        // Find the ImageButton for the back button by its ID
        val backButton = findViewById<ImageButton>(R.id.backButton)

        // Set OnClickListener to the back button
        backButton.setOnClickListener {
            // Finish the current activity and go back to the previous activity or fragment
            finish()
        }

        // Set video URI and start playing
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.ant_man_video)
        videoView.setVideoURI(videoUri)
        videoView.start()
    }
}
