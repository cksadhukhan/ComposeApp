package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.theme.ComposeAppTheme
import com.example.composeapp.ui.theme.primaryButtonColor
import com.example.composeapp.ui.theme.textLight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    OnBoardingScreen()
                }
            }
        }
    }
}

@Composable
fun OnBoardingScreen() {
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
            contentDescription = "Content description for visually impaired"
        )
        Image(
            painter = painterResource(R.drawable.ic_welcome),
            contentDescription = "Content description for visually impaired"
        )
        WelcomeText()
        AuthButton()
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
fun AuthButton(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 22.dp)
    ) {
        TextButton(onClick = {},
            contentPadding = PaddingValues(
                top = 12.dp,
                bottom = 12.dp
            ),
            modifier = Modifier.clip(RoundedCornerShape(40)).background(
                primaryButtonColor
            ).fillMaxWidth()
            ){
            Text(text = "Sign Up", style = TextStyle(color = Color.White, fontSize = 18.sp))
        }
        Text(text = "Already have an account? Log in", style = TextStyle(color = textLight, fontWeight = FontWeight.Medium, fontSize = 16.sp), modifier = Modifier.padding(10.dp))
    }
}