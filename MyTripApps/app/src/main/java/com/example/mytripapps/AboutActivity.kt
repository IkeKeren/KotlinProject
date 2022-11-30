package com.example.mytripapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Layout yang di pakai
        setContentView(R.layout.activity_about)

//        title Bar diganti judul
        supportActionBar?.title = "About me"

    }
}