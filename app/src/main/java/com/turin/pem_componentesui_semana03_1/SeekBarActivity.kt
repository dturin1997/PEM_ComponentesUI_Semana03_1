package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class SeekBarActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var seekBar: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        var textView = findViewById(R.id.count) as TextView
        var seekBar = findViewById(R.id.seekBar) as SeekBar
        // seekBar.setProgress(2);
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                textView.setText("Progress: " + progress + " / " + seekBar.getMax())
                Toast.makeText(
                    getApplicationContext(),
                    "SeekBar Progress Change",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Started", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Stop ", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }
}