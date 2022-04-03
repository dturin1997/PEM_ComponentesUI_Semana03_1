package com.turin.pem_componentesui_semana03_1

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class CustomAlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)
    }

    fun showDialog(view: View?) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        // Custom Android Allert Dialog Title
        dialog.setTitle("Custom Dialog Example")
        val dialogButtonCancel: Button = dialog.findViewById(R.id.customDialogCancel) as Button
        val dialogButtonOk: Button = dialog.findViewById(R.id.customDialogOk) as Button
        // Click cancel to dismiss android custom dialog box
        dialogButtonCancel.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(getApplicationContext(), "Cancel process!", Toast.LENGTH_SHORT)
                    .show()
                dialog.dismiss()
            }
        })

        // Your android custom dialog ok action
        // Action for custom dialog ok button click
        dialogButtonOk.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(getApplicationContext(), "Success process!", Toast.LENGTH_SHORT)
                    .show()
                dialog.dismiss()
            }
        })
        dialog.show()
    }
}