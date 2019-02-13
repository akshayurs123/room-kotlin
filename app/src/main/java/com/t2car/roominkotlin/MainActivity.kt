package com.t2car.roominkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.t2car.roominkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataArray: ArrayList<DataClass> = ArrayList()
        dataArray.add(DataClass("Jack", 12))
        dataArray.add(DataClass("Beck", 52))
        dataArray.add(DataClass("Glen", 37))
        val adapter = UserAdapter(dataArray, this)
        binding.rvMovieResult.layoutManager = LinearLayoutManager(this)
        binding.rvMovieResult.adapter = adapter
    }
}
