package com.example.composeapp

sealed class Screen(val route: String){
    object SignUp: Screen(route = "signup_screen")
    object SignIn: Screen(route = "signin_screen")
    object OnBoarding: Screen(route = "onboarding_screen")
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
}
