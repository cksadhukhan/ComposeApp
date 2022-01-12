package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.screens.OnBoardingScreen
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}