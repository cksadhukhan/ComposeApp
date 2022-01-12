package com.example.composeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.R
import com.example.composeapp.Screen
import com.example.composeapp.ui.theme.primaryButtonColor
import com.example.composeapp.ui.theme.textLight


@Composable
fun OnBoardingScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement =  Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_logo),
            contentDescription = "Logo"
        )
        Image(
            painter = painterResource(R.drawable.ic_welcome),
            contentDescription = "OnBoard"
        )
        WelcomeText()
        AuthButton(navController = navController)
    }
}

@Composable
fun WelcomeText(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 22.dp)
    ) {
        Text(text = "We are what we do", modifier = Modifier.padding(14.dp), style = TextStyle(fontSize = 32.sp))
        Text(text = "Thousand of people are using silent moon for smalls meditation", textAlign = TextAlign.Center, style = TextStyle(color = textLight, fontSize = 14.sp))
    }
}

@Composable
fun AuthButton(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 22.dp)
    ) {
        TextButton(onClick = {navController.navigate(Screen.SignUp.route)},
            contentPadding = PaddingValues(
                top = 12.dp,
                bottom = 12.dp
            ),
            modifier = Modifier
                .clip(RoundedCornerShape(40))
                .background(
                    primaryButtonColor
                )
                .fillMaxWidth()
        ){
            Text(text = "Sign Up", style = TextStyle(color = Color.White, fontSize = 18.sp))
        }
        Row{
            Text(text = "Already have an account?", style = TextStyle(color = textLight, fontWeight = FontWeight.Medium, fontSize = 16.sp), modifier = Modifier.padding(10.dp))
            Text(text = "Log in", style = TextStyle(color = primaryButtonColor, fontWeight = FontWeight.Medium, fontSize = 16.sp), modifier = Modifier
                .padding(vertical = 10.dp)
                .clickable { navController.navigate(Screen.SignIn.route) })
        }
    }
}

@Composable
@Preview(showBackground = true)
fun OnBoardingPreview(){
    OnBoardingScreen(navController = rememberNavController())
}
