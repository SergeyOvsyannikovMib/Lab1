package com.example.lab1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(color = Color(0xFF050B18))
                    .verticalScroll(rememberScrollState()),
            ) {
                Box {
                    Image(
                        painter = painterResource(R.drawable.header_image),
                        contentDescription = "Шапка",
                        modifier = Modifier
                            .size(628.dp, 354.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.dota_icon),
                        contentDescription = "Иконка",
                        modifier = Modifier
                            .padding(start = 4.dp, top = 305.dp)
                            .width(140.dp)
                            .height(150.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 124.dp, top = 14.dp)
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(top = 345.dp),
                            text = "Dota 2",
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 26.sp,
                                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFFFFFFFF),
                                letterSpacing = 0.5.sp,
                            )
                        )
                        Row(
                            modifier = Modifier
                                .padding(top = 7.dp),
                        ) {
                            Image(
                                painter = painterResource(R.drawable.all_stars),
                                contentDescription = "Рейтинг (пять звёзд)",
                                modifier = Modifier
                                    .size(76.dp, 12.dp)
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 10.dp),
                                text = "70M",
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                                    fontWeight = FontWeight(400),
                                    color = Color(0xFF45454D),
                                    letterSpacing = 0.5.sp,
                                )
                            )
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .offset(24.dp, (-20).dp)
                ) {
                    Row {
                        drawTags()
                    }
                }
                Text(
                    modifier = Modifier
                        .padding(24.dp, 5.dp, 24.dp, 0.dp),
                    text = getString(R.string.description),
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 19.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(400),
                        color = Color(0xB2EEF2FB),
                    )
                )
            }
        }
    }
}

@SuppressLint("ComposableNaming")
@Composable
fun drawTags() {
    Box(
        modifier = Modifier.size(53.dp, 22.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp, 5.dp)
        ) {
            Text(
                text = "MOBA",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
    Box(
        modifier = Modifier.size(93.dp, 22.dp).offset(10.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp, 5.dp)
        ) {
            Text(
                text = "MULTIPLAYER",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
    Box(
        modifier = Modifier.size(73.dp, 22.dp).offset(20.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp, 5.dp)
        ) {
            Text(
                text = "STRATEGY",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = FontFamily(Font(R.font.montserrat)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF44A9F4),
                )
            )
        }
    }
}