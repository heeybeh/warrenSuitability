package com.example.beatrice.warrensuitability.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import com.example.beatrice.warrensuitability.R
import com.example.beatrice.warrensuitability.model.MessageModel
import kotlinx.android.synthetic.main.message_item.view.*


class MessageAdapter(private val messages: List<MessageModel>, private val context: Context ) : RecyclerView.Adapter<MessageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.message_item, parent, false)

        return MessageHolder(itemView)
    }

    override fun onBindViewHolder(holder: MessageHolder, position: Int) {
        for (i in 0 until messages[position].messagesDTO!!.size) {
            holder.txtMessage.text = messages[position].messagesDTO!![i].toString()
        }


    }



    override fun getItemCount(): Int {
        return messages.size
    }
}