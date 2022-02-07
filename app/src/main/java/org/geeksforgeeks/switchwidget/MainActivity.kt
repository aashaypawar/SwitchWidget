package org.geeksforgeeks.switchwidget

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mSwitch = findViewById<Switch>(R.id.switch_1)

        mSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, "Switch On", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Switch Off", Toast.LENGTH_SHORT).show()
            }
        }
    }
}