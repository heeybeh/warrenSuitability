package com.example.beatrice.warrensuitability.model

import com.google.gson.annotations.SerializedName

class MessagesDTO {

    @SerializedName("type")
    var type: String? = null

    @SerializedName("value")
    var value: String? = null

}