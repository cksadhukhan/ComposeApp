package com.example.composeapp.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeapp.R
import com.example.composeapp.Screen
import com.example.composeapp.ui.theme.primaryButtonColor
import com.example.composeapp.ui.theme.textInputBackground
import com.example.composeapp.ui.theme.textLight

@Composable
fun SignInScreen(navController: NavController){
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    val scrollState = rememberScrollState()
    LaunchedEffect(Unit) { scrollState.animateScrollTo(0) }

    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.padding(top = 40.dp)
        ) {
            IconButton(onClick = { navController.popBackStack() },
                modifier = Modifier
                    .then(Modifier.size(45.dp))
                    .border(1.dp, Color.Gray, shape = CircleShape)
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "content description", tint = Color.DarkGray)
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.verticalScroll(scrollState)
        ) {
            Text(text = "Welcome Back", modifier = Modifier.padding(bottom = 10.dp), textAlign = TextAlign.Center, style = TextStyle(fontSize = 28.sp))
            Button(onClick = {},
                contentPadding = PaddingValues(
                    top = 12.dp,
                    bottom = 12.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
                ,
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = primaryButtonColor
                ),
                shape = RoundedCornerShape(50)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(painter = painterResource(R.drawable.ic_facebook), contentDescription = "OnBoard", modifier = Modifier.padding(end = 40.dp))
                    Text(text = "Continue With Facebook", style = TextStyle(color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Medium))
                }
            }
            OutlinedButton(onClick = {},
                contentPadding = PaddingValues(
                    top = 12.dp,
                    bottom = 12.dp
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                shape = RoundedCornerShape(50)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(painter = painterResource(R.drawable.ic_google), contentDescription = "OnBoard", modifier = Modifier.padding(end = 40.dp))
                    Text(text = "Continue With Google", style = TextStyle(color = Color.DarkGray, fontSize = 16.sp, fontWeight = FontWeight.Medium))
                }
            }
            Text(text = "Or Log In With Email", style = TextStyle(fontSize = 16.sp, color = textLight, fontWeight = FontWeight.Bold), modifier = Modifier.padding(vertical = 24.dp))

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(40),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = textInputBackground,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.DarkGray,
                    cursorColor = Color.DarkGray
                ),
            )

            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(40),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = textInputBackground,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedLabelColor = Color.DarkGray,
                    cursorColor = Color.DarkGray
                ),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )
            Column(
                modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)
            ) {
                TextButton(onClick = {navController.navigate(Screen.Welcome.route)},
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
                    Text(text = "Sign In", style = TextStyle(color = Color.White, fontSize = 18.sp))
                }
            }
            Text(text = "Forgot Password?")
        }
        Row(
            modifier = Modifier.padding(bottom = 20.dp, top = 60.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(text = "Don't have an account?", style = TextStyle(color = textLight, fontWeight = FontWeight.Medium, fontSize = 16.sp), modifier = Modifier.padding(10.dp))
            Text(text = "Sign Up", style = TextStyle(color = primaryButtonColor, fontWeight = FontWeight.Medium, fontSize = 16.sp), modifier = Modifier
                .padding(vertical = 10.dp)
                .clickable { navController.navigate(Screen.SignUp.route) })
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SignInScreenPreview(){
    SignInScreen(navController = rememberNavController())
}