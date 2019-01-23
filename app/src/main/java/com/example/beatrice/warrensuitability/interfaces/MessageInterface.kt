package com.example.beatrice.warrensuitability.interfaces

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import com.example.beatrice.warrensuitability.model.MessageModel

interface MessageInterface {

    @POST("api/v2/conversation/message/")
    fun postMessage(@Body body: RequestBody): Call<MessageModel>
}
