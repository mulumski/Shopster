package com.example.projectmulumbatwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private var datalist:ArrayList<DataClass>):RecyclerView.Adapter<ProductAdapter.ViewHolderClass>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {

        return datalist.size
    }


    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentitem = datalist[position]
        holder.rvImage.setImageResource(currentitem.dataimage)
        holder.rvTitle.text = currentitem.dataTitle
        holder.rvPrice.text = currentitem.dataPrice
    }
    class ViewHolderClass(itemView:View):RecyclerView.ViewHolder(itemView) {
        val rvImage:ImageView = itemView.findViewById(R.id.itemImage)
        val rvTitle:TextView=itemView.findViewById(R.id.itemName)
        val rvPrice:TextView=itemView.findViewById(R.id.itemPrice)
    }

}