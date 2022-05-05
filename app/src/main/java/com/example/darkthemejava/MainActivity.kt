package com.example.darkthemejava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButtonToggleGroup

class MainActivity : AppCompatActivity() {

    private lateinit var btn_theme: MaterialButtonToggleGroup;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        btn_theme = findViewById(R.id.btn_theme);
        btn_theme.addOnButtonCheckedListener(object :
            MaterialButtonToggleGroup.OnButtonCheckedListener{
            override fun onButtonChecked(
                group: MaterialButtonToggleGroup?,
                checkedId: Int,
                isChecked: Boolean
            ) {
                val theme = when(checkedId) {
                    R.id.btn_default ->  AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                    R.id.btn_dark ->  AppCompatDelegate.MODE_NIGHT_YES
                    else -> AppCompatDelegate.MODE_NIGHT_NO
                }
                AppCompatDelegate.setDefaultNightMode(theme);
            }
        })

    }
}