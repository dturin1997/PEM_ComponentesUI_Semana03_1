package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class FloatingActionButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)
    }
    fun action(view: View?) {
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show()
    }
}