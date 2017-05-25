package com.bugfender.samplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.bugfender.sdk.Bugfender

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Bugfender.d("TAG", "Hello World from MainActivity !")

        val navigateButton: Button = findViewById(R.id.activity_main_button) as Button
        navigateButton.setOnClickListener {
            val callingIntent = SecondActivity.callingIntent(this)
            startActivity(callingIntent)
        }
    }
}
