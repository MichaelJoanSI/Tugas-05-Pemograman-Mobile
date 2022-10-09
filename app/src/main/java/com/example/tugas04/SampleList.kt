package com.example.tugas04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SampleList : AppCompatActivity() {
    lateinit var btnSList : Button
    lateinit var btnSampleRecycler : Button
    lateinit var btnCardView: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnSList = findViewById(R.id.btnShowList)
        btnSampleRecycler = findViewById(R.id.btnSampleRV)
        btnCardView = findViewById(R.id.btnCardView)

        btnSList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent)})

        btnCardView.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleCardView::class.java)
            startActivity(intent)})

        btnSampleRecycler.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleRecyclerView::class.java)
            startActivity(intent)})
        }
    }