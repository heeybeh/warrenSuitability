package com.example.beatrice.warrensuitability.activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.beatrice.warrensuitability.R
import com.example.beatrice.warrensuitability.services.WarrenSuitabilityServices
import com.example.beatrice.warrensuitability.utils.ServiceResult
import com.example.beatrice.warrensuitability.viewModel.ServiceViewModel
import io.reactivex.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

internal lateinit var api:WarrenSuitabilityServices
    internal lateinit var compositeDisposable: CompositeDisposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        WarrenSuitabilityServices().postMessage(this)


        val viewModel = ViewModelProviders.of(this).get(ServiceViewModel::class.java!!)
        viewModel.startServices(this).observe(this, Observer<ServiceResult> { result ->

            if (result != null) {



            } else {

            }
        })
    }








//    private fun configureList() {
//        val recyclerView = recycler_view
//        recyclerView.adapter = MessageAdapter(messageList, this)
//        val layoutManager = StaggeredGridLayoutManager(
//                2, StaggeredGridLayoutManager.VERTICAL)
//        recyclerView.layoutManager = layoutManager
//    }

}
