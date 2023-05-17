package com.example.projectmulumbatwo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class UsersAdapter (var context: Context, var data:ArrayList<User>):BaseAdapter(){
    private class ViewHolder(row: View?){
        var mTxtname:TextView
        var mTxtEmail:TextView
        var mNumPhone:TextView
        var mtxtPsswd:TextView


        init {
            this.mTxtname= row?.findViewById(R.id.mEdtName) as TextView
            this.mTxtEmail= row?.findViewById(R.id.mEdtEmail) as TextView
            this.mTxtEmail= row?.findViewById(R.id.mEdtEmail) as TextView
            this.mNumPhone= row?.findViewById(R.id.mEdtPhone) as TextView
            this.mtxtPsswd= row?.findViewById(R.id.mEdtPasssword) as TextView

        }

    }

    override fun getCount(): Int {
        TODO("Not yet implemented")

    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")

    }

}