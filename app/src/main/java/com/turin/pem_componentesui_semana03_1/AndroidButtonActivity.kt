package com.turin.pem_componentesui_semana03_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AndroidButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)
    }

    fun showToastShort(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    fun callSimpleButton(view: View) {
        showToastShort("This is Simple Android Button")
    }


    fun callLeftIconButton(view: View) {
        showToastShort("Button With Icon in Left")
    }

    fun callRightIconButton(view: View) {
        showToastShort("Button With Icon in Right")
    }

    fun callBackgroundImageButton(view: View) {
        showToastShort("Button With Background Image")
    }

    fun callBorderButton(view: View) {
        showToastShort("Button With Border Color")
    }

    fun callBorderRadiusButton(view: View) {
        showToastShort("Button With Border Radius")
    }

    fun callRoundButton(view: View) {
        showToastShort("Round Button")
    }

    fun callMaterialDesignButton(view: View) {
        showToastShort("Material Design Button ")
    }
}