package com.example.beatrice.warrensuitability.interfaces

import android.arch.lifecycle.MutableLiveData
import android.content.Context
import com.example.beatrice.warrensuitability.utils.ServiceResult

interface WarrenSuitabilityInterface {

    fun postMessage(context: Context): MutableLiveData<ServiceResult>

}