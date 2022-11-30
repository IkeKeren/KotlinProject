package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// 1.1 Panggil dan definisikan button pindah activity
        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
// Jangan lupa implement View onclick
        btnMoveActivity.setOnClickListener(this)

//2.1  Panggil definisi button pindah data
        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

// 3.1 Panggil dial button
        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

//ketika button di pencet maka akan pindah activity
        when (v?.id) {

            //1.2  pindah pakai Intent (aktivity saat ini, ke tujuan activity)
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            //2.2 menggirim data ke activity lain
            R.id.btn_move_activity_data->{
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }

            //3.2 menggirim data ke activity IMPLISIT
            R.id.btn_dial_number -> {
                val phoneNumber = "081210841382"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }


        }
    }
}