package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView

class SwitchButtonActivity : AppCompatActivity() {
    private var switchButton: Switch? = null
    private var switchButton2: Switch? = null
    private var textView: TextView? = null
    private var textView2: TextView? = null
    private val switchOn = "Switch is ON"
    private val switchOff = "Switch is OFF"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        // For first switch button
        var switchButton = findViewById(R.id.switchButton) as Switch
        var textView = findViewById(R.id.textView) as TextView
        switchButton.setChecked(true)
        switchButton.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(compoundButton: CompoundButton?, bChecked: Boolean) {
                if (bChecked) {
                    textView.setText(switchOn)
                } else {
                    textView.setText(switchOff)
                }
            }
        })
        if (switchButton.isChecked()) {
            textView.setText(switchOn)
        } else {
            textView.setText(switchOff)
        }

        // for second switch button
        var switchButton2 = findViewById(R.id.switchButton2) as Switch
        var textView2 = findViewById(R.id.textView2) as TextView
        switchButton2.setChecked(false)
        switchButton2.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(compoundButton: CompoundButton?, bChecked: Boolean) {
                if (bChecked) {
                    textView2.setText(switchOn)
                } else {
                    textView2.setText(switchOff)
                }
            }
        })
        if (switchButton2.isChecked()) {
            textView2.setText(switchOn)
        } else {
            textView2.setText(switchOff)
        }

    }
}