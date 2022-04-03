package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class SnackbarActivity : AppCompatActivity() {
    private var rootLayout: CoordinatorLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
        var rootLayout = findViewById(R.id.coordinatorLayout) as CoordinatorLayout
    }
    fun showSnackbar(view: View?) {
        var rootLayout = findViewById(R.id.coordinatorLayout) as CoordinatorLayout
        val snackbar: Snackbar = Snackbar.make(
            rootLayout,
            "Hello, I am Android Snackbar!",
            Snackbar.LENGTH_LONG
        ) // Snackbar message
        snackbar.setAction("Undo", object : View.OnClickListener {
            //Snackbar action text
            override fun onClick(v: View?) {
                Toast.makeText(getApplicationContext(), "Undo proccess!", Toast.LENGTH_SHORT).show()
            }
        })
        snackbar.show()
    }
}