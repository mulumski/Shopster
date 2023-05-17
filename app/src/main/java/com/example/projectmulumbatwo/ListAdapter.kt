package com.example.projectmulumbatwo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter (context:Context , dataArrayList:ArrayList<Product?>?):
    ArrayAdapter<Product> (context , R.layout.list_item, dataArrayList!!){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        var product = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }

        val listName = view!!.findViewById<TextView>(R.id.itemName)
        val listPrice = view!!.findViewById<TextView>(R.id.itemPrice)


        listName.text = product!!.name
        listPrice.text = product!!.price

        return view




    }



}