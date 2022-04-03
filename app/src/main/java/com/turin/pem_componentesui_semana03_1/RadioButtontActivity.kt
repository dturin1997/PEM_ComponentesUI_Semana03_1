package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class RadioButtontActivity : AppCompatActivity() {
    private var radioGroup: RadioGroup? = null
    private var displayText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_buttont)

        var displayText = findViewById(R.id.dsplayText) as TextView
    }

    fun radioButtonClicked(view: View) {
        val checked: Boolean = (view as RadioButton).isChecked()
        when (view.getId()) {
            R.id.radioButton1 -> if (checked) //Do something when radio button is clicked
                Toast.makeText(
                    getApplicationContext(),
                    "It seems like you feeal RelativeLayout easy",
                    Toast.LENGTH_SHORT
                ).show()
            R.id.radioButton2 ->                 //Do something when radio button is clicked
                Toast.makeText(
                    getApplicationContext(),
                    "It seems like you feel LinearLayout easy",
                    Toast.LENGTH_SHORT
                ).show()
            R.id.radioButton3 ->                 //Do something when radio button is clicked
                Toast.makeText(
                    getApplicationContext(),
                    "It seems like you feel FrameLayout easy",
                    Toast.LENGTH_SHORT
                ).show()
            R.id.radioButton4 ->                 //Do something when radio button is clicked
                Toast.makeText(
                    getApplicationContext(),
                    "It seems like you feel TablleLayout easy",
                    Toast.LENGTH_SHORT
                ).show()
            R.id.radioButton5 ->                 //Do something when radio button is clicked
                Toast.makeText(
                    getApplicationContext(),
                    "It seems like you feel GridLayout easy",
                    Toast.LENGTH_SHORT
                ).show()
        }
    }

    fun answer(view: View?) {
        var radioGroup = findViewById(R.id.radioGroup) as RadioGroup

        val radioButtonId: Int = radioGroup.getCheckedRadioButtonId()
        if (radioButtonId == -1) {
            Toast.makeText(this, "This field is required!", Toast.LENGTH_LONG).show()
        } else {
            // Individual selected
            if (radioButtonId == R.id.radioButton1) {
                Toast.makeText(this, "You selected RelativeLayout", Toast.LENGTH_SHORT).show()
            } else if (radioButtonId == R.id.radioButton2) {
                Toast.makeText(this, "You selected LinearLayout", Toast.LENGTH_SHORT).show()
            } //...

            // Dinamic selected
            val radioButton: RadioButton = findViewById(radioButtonId) as RadioButton
            Toast.makeText(this, "This text is " + radioButton.getText(), Toast.LENGTH_SHORT).show()
        }
    }
}