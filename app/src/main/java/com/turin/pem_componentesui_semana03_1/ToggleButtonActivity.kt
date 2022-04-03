package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.TextView
import android.widget.ToggleButton

class ToggleButtonActivity : AppCompatActivity() {
    private var toggleButton1: ToggleButton? = null
    private var toggleButton2: ToggleButton? = null
    private var textView1: TextView? = null
    private var textView2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        var toggleButton1 = findViewById(R.id.toggleButton1) as ToggleButton
        var toggleButton2 = findViewById(R.id.toggleButton2) as ToggleButton
        var textView1 = findViewById(R.id.text_view1) as TextView
        var textView2 = findViewById(R.id.text_view2) as TextView
        toggleButton1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(compoundButton: CompoundButton?, checked: Boolean) {
                if (checked) {
                    textView1.setText("ToggleButton is ON")
                } else {
                    textView1.setText("ToggleButton is OFF")
                }
            }
        })
        toggleButton2.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(compoundButton: CompoundButton?, checked: Boolean) {
                if (checked) {
                    textView2.setText("ToggleButton is ON")
                } else {
                    textView2.setText("ToggleButton is OFF")
                }
            }
        })
        if (toggleButton1.isChecked()) {
            textView1.setText("ToggleButton is ON")
        } else {
            textView1.setText("ToggleButton is OFF")
        }
        if (toggleButton2.isChecked()) {
            textView2.setText("ToggleButton is ON")
        } else {
            textView2.setText("ToggleButton is OFF")
        }

    }
}