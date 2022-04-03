package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import java.util.*

class TimePickerActivity : AppCompatActivity() {
    private var timePicker: TimePicker? = null
    private var displayTime: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        var displayTime = findViewById(R.id.textView) as TextView
        var timePicker = findViewById(R.id.timePicker) as TimePicker
        timePicker.setIs24HourView(true)
        timePicker.setOnTimeChangedListener(object : TimePicker.OnTimeChangedListener {
            override fun onTimeChanged(view: TimePicker, hourOfDay: Int, minute: Int) {
                displayTime.setText("Time: $hourOfDay:$minute")
            }
        })

        // Optional: Set current time (Android time)
        val now = Calendar.getInstance()
        val hour = now[Calendar.HOUR_OF_DAY]
        val minute = now[Calendar.MINUTE]
        // This method was deprecated in API level 23. Use setHour() and setMinute()
        timePicker.setCurrentHour(hour)
        timePicker.setCurrentMinute(minute)
    }

    fun pick(view: View?) {
        var displayTime = findViewById(R.id.textView) as TextView
        var timePicker = findViewById(R.id.timePicker) as TimePicker
        // This method was deprecated in API level 23. Use getHour() and getMinute()
        displayTime.setText("Picked: " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute())
    }

}