package com.example.homework16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework16.presentation.MainFragment
import com.example.homework16.utils.navigateToFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.navigateToFragment(fragment = MainFragment())
    }
}