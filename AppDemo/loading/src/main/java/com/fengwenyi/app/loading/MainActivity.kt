package com.fengwenyi.app.loading

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFuzzy.setOnClickListener {
            startActivity(Intent(this, FuzzyActivity::class.java)) }
        btnFuzzyDemo.setOnClickListener {
            startActivity(Intent(this, FuzzyDemoActivity::class.java)) }
        btnProgress.setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java)) }
        btnProgressCustom.setOnClickListener {
            startActivity(Intent(this, ProgressCustomActivity::class.java)) }
        btnProgressDemo.setOnClickListener {
            startActivity(Intent(this, ProgressDemoActivity::class.java)) }
    }
}
