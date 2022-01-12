package com.example.composeapp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.NavigationItem
import com.example.composeapp.R
import com.example.composeapp.ui.theme.textLight
import androidx.compose.runtime.setValue

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = "logo"
                )
            }
            Text(
                text = "Good Morning, Chanchal",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "We wish you have a good day",
                style = TextStyle(color = textLight, fontSize = 16.sp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 22.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10))
                        .background(Color(0xFF8E97FD))
                        .width(170.dp)
                        .padding(8.dp)
                ) {
                    Spacer(modifier = Modifier.padding(vertical = 20.dp))
                    Column{
                        Text(
                            text = "Basics",
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                        Text(
                            text = "Course",
                            style = TextStyle(fontSize = 14.sp, color = Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.padding(vertical = 16.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "3-10 Min",
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                        TextButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .clip(RoundedCornerShape(40))
                                .background(Color(0xFFEBEAEC)),
                            contentPadding = PaddingValues(
                                horizontal = 2.dp,
                                vertical = 2.dp
                            )
                        ) {
                            Text(text = "Start", style = TextStyle(color = Color.DarkGray))
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10))
                        .background(Color(0xFFFFC97E))
                        .width(170.dp)
                        .padding(8.dp)
                ) {
                    Spacer(modifier = Modifier.padding(vertical = 20.dp))
                    Column{
                        Text(
                            text = "Relaxation",
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                        Text(
                            text = "Course",
                            style = TextStyle(fontSize = 14.sp, color = Color.White)
                        )
                    }
                    Spacer(modifier = Modifier.padding(vertical = 16.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "3-10 Min",
                            style = TextStyle(fontSize = 18.sp, color = Color.White)
                        )
                        TextButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .clip(RoundedCornerShape(40))
                                .background(Color(0xFF3F414E)),
                            contentPadding = PaddingValues(
                                horizontal = 2.dp,
                                vertical = 2.dp
                            )
                        ) {
                            Text(text = "Start", style = TextStyle(color = Color.White))
                        }
                    }
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(top = 6.dp, bottom = 18.dp)
                    .clip(RoundedCornerShape(10))
                    .background(Color(0xFF333242))
                    .fillMaxWidth()
                    .padding(vertical = 16.dp, horizontal = 22.dp)
            ) {
                Column{
                    Text(
                        text = "Daily Thought",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        ),
                        modifier = Modifier.padding(bottom = 4.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Meditation",
                            style = TextStyle(fontSize = 14.sp, color = Color.White)
                        )
                        Text(
                            text = "|",
                            style = TextStyle(fontSize = 16.sp, color = Color.White),
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )
                        Text(
                            text = "3-10 Min",
                            style = TextStyle(fontSize = 14.sp, color = Color.White)
                        )
                    }
                }
                IconButton(modifier = Modifier
                    .then(Modifier.size(34.dp))
                    .clip(RoundedCornerShape(50))
                    .background(Color.White),
                    onClick = { }) {
                    Icon(
                        Icons.Filled.PlayArrow,
                        "contentDescription",
                        tint = Color(0xFF333242)
                    )
                }
            }
            Text(
                text = "Recommended for you",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3F414E)
            )
            Row(
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(6.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_group_1),
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Text(
                            text = "Focus",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Meditation",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                            Text(
                                text = "|",
                                style = TextStyle(fontSize = 12.sp, color = textLight),
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                            Text(
                                text = "3-10 Min",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(6.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_group_2),
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Text(
                            text = "Focus",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Meditation",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                            Text(
                                text = "|",
                                style = TextStyle(fontSize = 12.sp, color = textLight),
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                            Text(
                                text = "3-10 Min",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                        }
                    }
                }

                Column(
                    modifier = Modifier.padding(6.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_group_1),
                        contentDescription = ""
                    )
                    Column(
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Text(
                            text = "Happiness",
                            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Meditation",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                            Text(
                                text = "|",
                                style = TextStyle(fontSize = 12.sp, color = textLight),
                                modifier = Modifier.padding(horizontal = 8.dp)
                            )
                            Text(
                                text = "3-10 Min",
                                style = TextStyle(fontSize = 12.sp, color = textLight)
                            )
                        }
                    }
                }
            }
        }
        BottomMenu(items = listOf(
            NavigationItem.Home,
            NavigationItem.Sleep,
            NavigationItem.Meditate,
            NavigationItem.Music,
            NavigationItem.Account
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun BottomMenu(
    items: List<NavigationItem>,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = Color(0xFF8E97FD),
    activeTextColor: Color = Color(0xFF8E97FD),
    inactiveTextColor: Color = Color(0xFFA0A3B1),
    initialSelectedItemIndex: Int = 0
) {
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(15.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItemIndex = index
            }
        }
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun BottomMenuItem(
    item: NavigationItem,
    isSelected: Boolean = false,
    activeHighlightColor: Color = Color.Blue,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.Red,
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
        ){
            onItemClick()
        }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighlightColor else Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.icon),
                contentDescription = item.title,
                tint = if (isSelected) Color(0xFFFFFFFF) else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )
        }
        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen()
}