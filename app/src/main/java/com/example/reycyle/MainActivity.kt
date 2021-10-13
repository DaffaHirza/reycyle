package com.example.reycyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pahlawanlist = listOf<pahlawan>(
            pahlawan(
                R.drawable.natsir,
                namapahlawan = "Mohammad Natsir",
                deskripsipahlawan = "Mohammad Natsir adalah nama pahlawan nasional dan pemikir Islam yang sempat menjabat Ketua Majelis Syuro Muslimin Indonesia atau Masyumi."
            ),
            pahlawan(
                R.drawable.yamin,
                namapahlawan = "Mohammad Yamin",
                deskripsipahlawan = "Mohammad Yamin adalah tokoh yang merumuskan Sumpah Pemuda pada Kongres Pemuda II."
            ),
            pahlawan(
                R.drawable.kartini,
                namapahlawan = "Raden Adjeng Kartini",
                deskripsipahlawan = "RA Kartini dikenal sebagai pahlawan yang memperjuangkan kaum perempuan."
            ),
            pahlawan(
                R.drawable.bung_tomo,
                namapahlawan = "Soetomo",
                deskripsipahlawan = "Soetomo dikenal dari peristiwa bersejarah di Surabaya, yaitu “Pertempuran 10 November 1945”."
            ),
            pahlawan(
                R.drawable.kartini,
                namapahlawan = "Raden Adjeng Kartini",
                deskripsipahlawan = "RA Kartini dikenal sebagai pahlawan yang memperjuangkan kaum perempuan."
            ),
            pahlawan(
                R.drawable.kartini,
                namapahlawan = "Raden Adjeng Kartini",
                deskripsipahlawan = "RA Kartini dikenal sebagai pahlawan yang memperjuangkan kaum perempuan."
            ),
            pahlawan(
                R.drawable.kartini,
                namapahlawan = "Raden Adjeng Kartini",
                deskripsipahlawan = "RA Kartini dikenal sebagai pahlawan yang memperjuangkan kaum perempuan."
            ),
            pahlawan(
                R.drawable.kartini,
                namapahlawan = "Raden Adjeng Kartini",
                deskripsipahlawan = "RA Kartini dikenal sebagai pahlawan yang memperjuangkan kaum perempuan."
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.Pahlawan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = pahlawanadapter(this, pahlawanlist){
            val intent = Intent(this, DetailPahlawanActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}