package com.turin.pem_componentesui_semana03_1

import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import androidx.annotation.RequiresApi

class DatePickerActivity : AppCompatActivity() {
    private var datePicker: DatePicker? = null
    private var displayDate: TextView? = null

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)
        var displayDate = findViewById(R.id.display_date) as TextView
        var datePicker = findViewById(R.id.datePicker) as DatePicker

        // current date
        val year: Int = Calendar.getInstance().get(Calendar.YEAR)
        val month: Int = Calendar.getInstance().get(Calendar.MONTH)
        val day: Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)

        datePicker.init(year, month, day, object : DatePicker.OnDateChangedListener {
            override fun onDateChanged(view: DatePicker?, yy: Int, mm: Int, dd: Int) {
                displayDate.setText("Date: " + dd + "/" + (mm + 1) + "/" + yy)
            }
        })
    }

    fun pick(view: View?) {
        var displayDate = findViewById(R.id.display_date) as TextView
        var datePicker = findViewById(R.id.datePicker) as DatePicker
        val currentDate = "Picked: " + datePicker.getDayOfMonth()
            .toString() + "/" + (datePicker.getMonth() + 1).toString() + "/" + datePicker.getYear()
        displayDate.setText(currentDate)
    }

}