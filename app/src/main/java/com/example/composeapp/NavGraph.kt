package com.example.composeapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composeapp.screens.*

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
  NavHost(navController = navController, startDestination = Screen.OnBoarding.route){
      composable(
          route = Screen.OnBoarding.route
      ){
          OnBoardingScreen(navController = navController)
      }
      composable(
          route = Screen.SignUp.route
      ){
          SignUpScreen(navController = navController)
      }
      composable(
          route = Screen.SignIn.route
      ){
          SignInScreen(navController = navController)
      }
      composable(
          route = Screen.Welcome.route
      ){
          WelcomeScreen(navController = navController)
      }
      composable(
          route = Screen.Home.route
      ){
          HomeScreen()
      }
  }
}