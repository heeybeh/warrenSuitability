package com.example.beatrice.warrensuitability.model

import com.google.gson.annotations.SerializedName


class MessageModel  {

    @SerializedName("id")
    var id: String? = null

    @SerializedName("messages")
    private var messagesDTO: ArrayList<MessagesDTO>? = null

    @SerializedName("buttons")
    private var buttonsArray: ArrayList<String>? = null

    @SerializedName("inputs")
    private var inputsDTO: ArrayList<InpustDTO>? = null

    @SerializedName("responses")
    private var responsesArray: ArrayList<String>? = null



}
