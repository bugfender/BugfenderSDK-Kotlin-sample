package com.bugfender.samplekotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    companion object {
        fun callingIntent(context: Context): Intent {
            return Intent(context, SecondActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton = findViewById(R.id.activity_second_go_back) as Button
        backButton.setOnClickListener {
            onBackPressed()
        }
    }

}
