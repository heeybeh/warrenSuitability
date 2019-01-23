package com.example.beatrice.warrensuitability.utils

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class HeaderInterceptor : Interceptor {

    private var key: String = ""

    fun HeaderInterceptor() {

        this.key = key
    }

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        val original = chain.request()
        val request: Request

            request = original.newBuilder()
                    .header("Content-Type", "application/json")
                    .method(original.method(), original.body())
                    .build()


        return chain.proceed(request)

    }
}