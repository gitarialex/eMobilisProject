package com.example.yourretail.util

import androidx.fragment.app.Fragment
import com.example.yourretail.R
import com.example.yourretail.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.yourretail.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.yourretail.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}