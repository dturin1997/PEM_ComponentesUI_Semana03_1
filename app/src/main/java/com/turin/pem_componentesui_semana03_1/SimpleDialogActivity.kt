package com.turin.pem_componentesui_semana03_1

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class SimpleDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_dialog)
    }

    fun showDialog(view: View?) {
        val alertDialog: android.app.AlertDialog = android.app.AlertDialog.Builder(this).create()
        alertDialog.setTitle("Alert Dialog Title")
        alertDialog.setMessage("Here is android alert dialog message")
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
            object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    // Alert dialog action goes here
                    dialog.dismiss() // use dismiss to cancel alert dialog
                }
            })
        alertDialog.show()
    }

}