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


class MessageAdapter(private val messages: List<MessageModel>, private val context: Context ) : Adapter<MessageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.message_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val mg = messages[position]

        holder.let {
            it.bindView(mg)

        }
    }



    override fun getItemCount(): Int {
        return messages.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(mg: MessageModel) {

            val textMessage = itemView.text_message

         textMessage.text = mg.messagesDTO.toString()
        }
    }
}