package com.example.beatrice.warrensuitability.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.Context
import com.example.beatrice.warrensuitability.services.WarrenSuitabilityServices
import com.example.beatrice.warrensuitability.utils.ServiceResult

class ServiceViewModel : ViewModel() {

    fun startServices(context: Context): MutableLiveData<ServiceResult> {

        return  WarrenSuitabilityServices().postMessage(context)
    }
}