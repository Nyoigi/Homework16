package com.example.homework16.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homework16.R

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    this.beginTransaction()
        .replace(R.id.fragmentContainer, fragment)
        .commit()
}