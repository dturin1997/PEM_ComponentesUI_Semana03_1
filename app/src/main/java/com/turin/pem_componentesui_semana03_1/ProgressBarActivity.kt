package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar

class ProgressBarActivity : AppCompatActivity() {
    private var numbertext: EditText? = null
    private var progressbar1: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        var numbertext = findViewById(R.id.numberText) as EditText
        var progressbar1 = findViewById(R.id.progressbar1) as ProgressBar
        progressbar1.setProgress(30)
    }

    fun show(view: View?) {
        var numbertext = findViewById(R.id.numberText) as EditText
        var progressbar1 = findViewById(R.id.progressbar1) as ProgressBar
        val value: Int = numbertext.getText().toString().toInt()
        progressbar1.setProgress(value)
    }

}