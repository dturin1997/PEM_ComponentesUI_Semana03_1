package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class RatingBarActivity : AppCompatActivity() {
    private var ratingBar: RatingBar? = null
    private var rateDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        var ratingBar = findViewById(R.id.ratingBar) as RatingBar
        var rateDisplay = findViewById(R.id.ratingDisplay) as TextView
        rateDisplay.setText("Rate:")
    }

    fun rateSubmit(view: View?) {
        var ratingBar = findViewById(R.id.ratingBar) as RatingBar
        var rateDisplay = findViewById(R.id.ratingDisplay) as TextView
        val ratingValue: String = java.lang.String.valueOf(ratingBar.getRating())
        rateDisplay.setText("Rate: $ratingValue")
        Toast.makeText(getApplicationContext(), "Rate: $ratingValue", Toast.LENGTH_LONG).show()
    }
}