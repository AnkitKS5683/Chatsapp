package com.example.clatsapp.fragments

import android.view.View
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.clatsapp.models.Inbox
import com.example.clatsapp.models.User
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_user.view.*

class UserViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun bind(user: User, onClick:(name:String, uid:String, thumbImg:String)->Unit) = with(itemView){
        countTv.isVisible = false
        timeTv.isVisible = false

        titleTv.text = user.name
        subtitleTv.text = user.status

        Picasso.get().load(user.thumbImg).into(userImgView)
        setOnClickListener{
            onClick.invoke(user.name,user.uid,user.thumbImg)
        }
    }
}