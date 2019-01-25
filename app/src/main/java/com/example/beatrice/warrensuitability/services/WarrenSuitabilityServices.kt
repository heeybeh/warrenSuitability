package com.example.beatrice.warrensuitability.services

import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.util.Log
import com.example.beatrice.warrensuitability.interfaces.MessageInterface
import com.example.beatrice.warrensuitability.interfaces.ResponseMessageInterface
import com.example.beatrice.warrensuitability.interfaces.WarrenSuitabilityInterface
import com.example.beatrice.warrensuitability.model.MessageModel
import com.example.beatrice.warrensuitability.utils.HeaderInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import com.example.beatrice.warrensuitability.utils.Constants.URL_BASE
import com.example.beatrice.warrensuitability.utils.ServiceResult
import okhttp3.RequestBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.HashMap

class WarrenSuitabilityServices : WarrenSuitabilityInterface {

    private val TIME_OUT = 30
    private var retrofit: Retrofit? = null

    fun initRequest() {

        val headerInterceptor = HeaderInterceptor()
        val httpClient = OkHttpClient.Builder().addNetworkInterceptor(headerInterceptor)
                .connectTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
                .readTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)

        val client = httpClient.build()
        retrofit = Retrofit.Builder()
                .baseUrl("$URL_BASE/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
    }


    override fun postMessage(context: Context): MutableLiveData<ServiceResult> {

        val mutableDataServiceResult = MutableLiveData<ServiceResult>()

        this.initRequest()

        val paramObject = JSONObject()

        try {

            paramObject.put("context", "suitability")

            val body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), paramObject.toString())

            val service = retrofit?.create<MessageInterface>(MessageInterface::class.java!!)

            val call = service?.postMessage(body)
            var mess : MessageModel?

            call?.enqueue(object : Callback<MessageModel> {

                override fun onResponse(call: Call<MessageModel>, response: Response<MessageModel>) {

                    if (response.isSuccessful()) {

                        mess = response?.body()

                        val serviceResult = ServiceResult(0, mess)

                        mutableDataServiceResult.setValue(serviceResult)

                    } else {


                    }
                }

                override fun onFailure(call: Call<MessageModel>, t: Throwable) {
                    Log.i("ERROR", t.message)
                }
            })

        } catch (e: JSONException) {



            e.printStackTrace()
        }

        return mutableDataServiceResult
    }

}