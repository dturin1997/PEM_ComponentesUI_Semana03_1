package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : AppCompatActivity() {
    private var spinner1: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        var spinner1 = findViewById(R.id.spinner) as Spinner
        spinner1.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
                Toast.makeText(
                    parent.getContext(),
                    "You have selected : " + parent.getItemAtPosition(pos).toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(arg: AdapterView<*>?) {}
        })
    }

    fun showvalue(view: View?) {
        var spinner1 = findViewById(R.id.spinner) as Spinner
        val item = spinner1.getSelectedItem() as String
        Toast.makeText(this, "You have selected : $item", Toast.LENGTH_SHORT).show()
    }
}