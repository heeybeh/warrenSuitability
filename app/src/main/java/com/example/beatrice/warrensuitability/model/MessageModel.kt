package com.example.beatrice.warrensuitability.model

import com.google.gson.annotations.SerializedName


class MessageModel  {

    @SerializedName("id")
    var id: String? = null

    @SerializedName("messages")
    var messagesDTO: ArrayList<MessagesDTO>? = null

    @SerializedName("buttons")
    var buttonsArray: ArrayList<String>? = null

    @SerializedName("inputs")
    var inputsDTO: ArrayList<InpustDTO>? = null

    @SerializedName("responses")
    var responsesArray: ArrayList<String>? = null
}
