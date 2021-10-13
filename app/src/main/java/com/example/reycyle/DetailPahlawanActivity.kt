package com.example.reycyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPahlawanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pahlawan2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pahlawan = intent.getParcelableExtra<pahlawan>(MainActivity.INTENT_PARCELABLE)
        val imgpahlawan = findViewById<ImageView>(R.id.img_item_photo)
        val namapahlawan = findViewById<TextView>(R.id.tv_item_name)
        val deskripsipahlawan = findViewById<TextView>(R.id.tv_item_description)

        imgpahlawan.setImageResource(pahlawan?.imgpahlawan!!)
        namapahlawan.text = pahlawan.namapahlawan
        deskripsipahlawan.text = pahlawan.deskripsipahlawan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}