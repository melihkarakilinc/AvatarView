package com.melihkarakilinc.avatarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.getstream.avatarview.AvatarView
import io.getstream.avatarview.coil.loadImage

class MainActivity : AppCompatActivity() {
    lateinit var avatarView: AvatarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        avatarView=findViewById(R.id.avatarView)

        avatarView.loadImage("https://avatars.githubusercontent.com/u/57638333?s=400&u=f083a7bf4e13e4adcb3c54297e77627b90303f87&v=4")

    }
}