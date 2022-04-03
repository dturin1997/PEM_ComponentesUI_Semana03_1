package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

    }

    fun register(view: View) {
        var firstName = findViewById(R.id.firstName) as EditText
        var lastName = findViewById(R.id.lastName) as EditText
        var displayname = findViewById(R.id.displayName) as TextView
        val getFirstName: String = firstName.getText().toString()
        val getLastName: String = lastName.getText().toString()
        if (getFirstName.length == 0 || getLastName.length == 0) displayname.setText("These fields are required") else displayname.setText(
            "Your username is $getFirstName $getLastName"
        )
    }

}