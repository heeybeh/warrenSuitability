//package com.example.beatrice.warrensuitability.activities
//
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//import android.support.v7.widget.StaggeredGridLayoutManager
//
//import com.example.beatrice.warrensuitability.R
//import com.example.beatrice.warrensuitability.adapters.MessageAdapter
//import com.example.beatrice.warrensuitability.model.MessageModel
//import com.example.beatrice.warrensuitability.services.WarrenSuitabilityServices
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity() {
//
//    private val messageList: List<MessageModel> = listOf()
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        WarrenSuitabilityServices().postMessage(object : CallbackResponse<List<MessageModel>> {
//
//            override fun success(messageList: List<MessageModel>) {
//
//                configureList()
//            }
//        })
//
//    }
//
//
//    private fun configureList() {
//        val recyclerView = recycler_view
//        recyclerView.adapter = MessageAdapter(messageList, this)
//        val layoutManager = StaggeredGridLayoutManager(
//                2, StaggeredGridLayoutManager.VERTICAL)
//        recyclerView.layoutManager = layoutManager
//    }
//
//}
