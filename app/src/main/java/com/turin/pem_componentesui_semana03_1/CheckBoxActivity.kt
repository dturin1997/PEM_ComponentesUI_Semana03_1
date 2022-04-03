package com.turin.pem_componentesui_semana03_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast


class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        var checkBox = findViewById(R.id.checkBox) as CheckBox

        // Setting check to specific checkbox
        checkBox.setChecked(true)
        if (checkBox.isChecked()) Toast.makeText(
            this,
            "First checkbox is checked!",
            Toast.LENGTH_LONG
        ).show()
    }

    fun androidCheckBoxClicked(view: View) {
        // action for checkbox click
        when (view.getId()) {
            R.id.checkBox -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox2 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox3 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox4 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox5 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox6 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox7 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox8 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.checkBox9 -> {
                val checkBox: CheckBox = view as CheckBox
                if (checkBox.isChecked()) Toast.makeText(
                    this,
                    checkBox.getText().toString() + " selected!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}