package com.syatria.crud

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.syatria.crud.model.DataItem

class KategoriAdapter(val dataKategori: List<DataItem?>?) :
    RecyclerView.Adapter<KategoriAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvKategori = view.findViewById<TextView>(R.id.item_tv_kategori)
        val tvTanggal = view.findViewById<TextView>(R.id.item_tv_tanggal_buat)
        val imgKategori = view.findViewById<ImageView>(R.id.item_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row_kategori, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvKategori.text = dataKategori?.get(position)?.namaKategori
        holder.tvTanggal.text = dataKategori?.get(position)?.createdAt

        val image = "http://ictjuara.000webhostapp.com/asset/ict.png"
        Picasso.get()
            .load(R.drawable.cicak)
            .placeholder(R.drawable.seblak) //sementara loading gamabr ini yang ditampilkan
            .error(R.drawable.seblak)
            .into(holder.imgKategori)


    }

    override fun getItemCount(): Int {
        if (dataKategori != null) {
            return dataKategori.size
        }
        return 0
    }


}