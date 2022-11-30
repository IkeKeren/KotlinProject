package com.example.mytripapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//kalau Adapter harus buat Constructor dan extend Recycle view Adapter pada Class
class ListTripAdapter (val listTrip: ArrayList<Trip>) : RecyclerView.Adapter<ListTripAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

//ini adalah turunan dari Recylce View Adapter --> sampai bawah
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_trip, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val trip = listTrip[position]

        Glide.with(holder.itemView.context)
            .load(trip.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = trip.name
        holder.tvDetail.text = trip.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTrip[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listTrip.size
    }
// ---> sampai sini turunan dari Recycle view adapter

//    bikin inner calss karena pakai Recycle view
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Trip)
    }

}
