package com.example.composeapp

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Sleep : NavigationItem("sleep", R.drawable.ic_sleep, "Sleep")
    object Meditate : NavigationItem("meditate", R.drawable.ic_meditate, "Meditate")
    object Music : NavigationItem("music", R.drawable.ic_music, "Music")
    object Account : NavigationItem("account", R.drawable.ic_account, "Account")
}