package com.example.reycyle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class pahlawanadapter(private val context: Context, private val pahlawan: List<pahlawan>, val listener: (pahlawan) -> Unit)
    :RecyclerView.Adapter<pahlawanadapter.pahlawanViewHolder>(){

    class pahlawanViewHolder(view: View):RecyclerView.ViewHolder(view){

        val imgpahlawan = view.findViewById<ImageView>(R.id.img_item_photo)
        val namapahlawan = view.findViewById<TextView>(R.id.tv_item_name)
        val deskripsipahlawan = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pahlawan: pahlawan, listener: (pahlawan) -> Unit){
            imgpahlawan.setImageResource(pahlawan.imgpahlawan)
            namapahlawan.text = pahlawan.namapahlawan
            deskripsipahlawan.text = pahlawan.deskripsipahlawan
            itemView.setOnClickListener {
                listener(pahlawan)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pahlawanViewHolder {
        return pahlawanViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: pahlawanViewHolder, position: Int) {
        holder.bindView(pahlawan[position], listener)
    }

    override fun getItemCount(): Int = pahlawan.size

}