package com.example.composeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.R
import com.example.composeapp.Screen
import com.example.composeapp.ui.theme.textLighter

@Composable
fun WelcomeScreen(navController: NavController){
    Box{
        Image(painter = painterResource(R.drawable.ic_getstated), contentDescription = "welcome",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.FillWidth
        )
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 60.dp)
                .fillMaxSize(),
        ) {
            Image(
                painter = painterResource(R.drawable.ic_logo_white),
                contentDescription = "Logo",
                colorFilter = ColorFilter.tint(Color.White)
            )
            TextButton(onClick = {navController.navigate(Screen.Home.route)},
                contentPadding = PaddingValues(
                    top = 12.dp,
                    bottom = 12.dp
                ),
                modifier = Modifier
                    .clip(RoundedCornerShape(40))
                    .background(
                        textLighter
                    )
                    .fillMaxWidth()
            ){
                Text(text = "Get Started", style = TextStyle(color = Color.DarkGray, fontSize = 18.sp, fontWeight = FontWeight.Medium))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WelcomeScreenPreview(){
    WelcomeScreen(navController = rememberNavController())
}