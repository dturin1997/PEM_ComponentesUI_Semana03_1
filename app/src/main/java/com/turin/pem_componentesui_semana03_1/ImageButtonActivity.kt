package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ImageButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)
    }
    fun showToastShort(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    fun firstImageButton(view: View) {
        showToastShort("This is the first Image")
    }

    fun secondImageButton(view: View) {
        showToastShort("This is the Second Image")
    }
}