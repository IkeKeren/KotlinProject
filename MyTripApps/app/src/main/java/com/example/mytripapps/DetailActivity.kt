package com.example.mytripapps

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//Detail Activity Extend View OnClickListener untuk menangkap aksi klik
class DetailActivity : AppCompatActivity(),View.OnClickListener {



//    persiapan variabel untuk menerima data dari activity lain
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        variable untuk View
        val tvNameTrip: TextView = findViewById(R.id.tv_item_name)
        val tvDetailTrip: TextView = findViewById(R.id.tv_item_detail)
        val imgPhotoTrip: ImageView = findViewById(R.id.img_item_photo)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this) //memberikan aksi/fungsi kalau diklik buttonnya

//        ngambil data dari companion yg telah dikirim dari activity lain
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO,0)


//      memberikan title bar sesuai dengan data name
        supportActionBar?.title = name

        //set/ memasukan image, nama dan deskripsi pada View
        imgPhotoTrip.setImageResource(photo)
        tvNameTrip.text = name
        tvDetailTrip.text= detail



    }


    //    Fungsi Button kalau di klik
    override fun onClick(v : View) {

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        val text = "*Salah Satu Destinasi Wisata Indonesia yang bisa kamu kunjungi adalah :$name*, \n \n$detail"

        when (v.id) {
            R.id.btn_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, text)
                    type = "text/plain"
                }
                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)

            }
        }
    }
}