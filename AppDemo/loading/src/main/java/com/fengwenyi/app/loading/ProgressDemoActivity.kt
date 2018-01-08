package com.fengwenyi.app.loading

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_progress_demo.*

class ProgressDemoActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_demo)

        val bar = progessDemoBar
        val value = progessDemoValue

        Thread {
            var i = 0
            while (i < 100) {
                i = (i + Math.random() * 10).toInt()
                Thread.sleep(100)
                if (i > 100) {
                    i = 100
                }
                bar.progress = i
                runOnUiThread {
                    value.text = "$i %"
                }
            }
        }.start()
    }
}
