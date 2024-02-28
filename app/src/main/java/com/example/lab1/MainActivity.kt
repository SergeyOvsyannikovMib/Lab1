package com.example.lab1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                    Image( // шапка
                        painter = painterResource(R.drawable.header_image),
                        contentDescription = "Шапка",
                        modifier = Modifier
                            .size(628.dp, 354.dp)
                    )
                    Image( // иконка
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
                        Text( // название
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
                            Image( // рейтинг
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
                Box( // теги
                    modifier = Modifier
                        .offset(24.dp, (-20).dp)
                ) {
                    Row {
                        drawTag("MOBA")
                        drawTag("MULTIPLAYER")
                        drawTag("STRATEGY")
                    }
                }
                Text( // описание
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
                Row( // скрины
                    modifier = Modifier.padding(start = 24.dp, top = 15.dp)
                        .horizontalScroll(rememberScrollState()),
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.gameplay1),
                            contentDescription = "Скриншот 1",
                            modifier = Modifier.size(240.dp, 128.dp)
                                .clip(RoundedCornerShape(14.dp)),
                            contentScale = ContentScale.FillBounds
                        )
                        Box(
                            modifier = Modifier
                                .border(width = 0.7.dp, color = Color(0x00FFFFFF))
                                .padding(0.7.dp)
                                .offset(96.dp, 43.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.dota_gameplay_icon),
                                contentDescription = "Кнопка воспроизведения видео",
                                modifier = Modifier.size(48.dp)
                            )
                        }
                    }
                    Image(
                        painter = painterResource(id = R.drawable.gameplay2),
                        contentDescription = "Скриншот 2",
                        modifier = Modifier.size(240.dp, 128.dp).padding(start = 15.dp)
                            .clip(RoundedCornerShape(14.dp)),
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text( // заголовок отзывов
                    modifier = Modifier.padding(start = 24.dp, top = 20.dp),
                    text = "Review & Ratings",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.sk_modernist)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFEEF2FB),
                        letterSpacing = 0.6.sp,
                    )
                )
                Row(
                    modifier = Modifier
                        .padding(start = 24.dp, top =  12.dp)
                ) {
                    Text(
                        text = "4.9",
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily(Font(R.font.sk_modernist)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                    Column(
                        modifier = Modifier.padding(start = 16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.almost_all_stars),
                            contentDescription = "Рейтинг (4.5 звезды)",
                            modifier = Modifier.padding(top = 17.dp).size(76.dp, 12.dp)
                        )
                        Text(
                            modifier = Modifier.padding(top = 8.dp, end = 7.dp),
                            text = "70M Reviews",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFFA8ADB7),
                                letterSpacing = 0.5.sp,
                            )
                        )
                    }
                }
                // отзывы
                drawRating(
                    R.drawable.auguste,
                    "Auguste Conte",
                    "February 14, 2019",
                    getString(R.string.review)
                )
                Divider(
                    color = Color(0xFF1A1F29),
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(38.dp, 24.dp)
                )
                drawRating(
                    R.drawable.jang,
                    "Jang Marcelino",
                    "February 14, 2019",
                    getString(R.string.review)
                )
                // кнопка установить
                Box(
                    modifier = Modifier.padding(24.dp, 40.dp)
                        .background(
                            color = Color(0xFFF4D144),
                            shape = RoundedCornerShape(size = 12.dp)
                        ).clickable(
                            onClick = {
                                val message = Toast(baseContext)
                                message.setText("Installed!")
                                message.show()
                            }
                        )
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.size(402.dp, 60.dp)
                    ) {
                        Text(
                            text = "Install",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily(Font(R.font.sk_modernist)),
                                fontWeight = FontWeight(700),
                                color = Color(0xFF050B18),
                                letterSpacing = 0.6.sp,
                            )
                        )
                    }
                }
            }
        }
    }
}

@SuppressLint("ComposableNaming")
@Composable
fun drawTag(tagName: String) {
    Box(
        modifier = Modifier.padding(end = 5.dp)
            .background(
                color = Color(0x3D44A9F4),
                shape = RoundedCornerShape(size = 100.dp)
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp, 5.dp)
        ) {
            Text(
                text = tagName,
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

@SuppressLint("ComposableNaming")
@Composable
fun drawRating(userpic: Int, username: String, reviewdate: String, review: String) {
    Row(
        modifier = Modifier
            .padding(start = 24.dp)
            .background(color = Color(0xFF050B18))
    ) {
        Image(
            painter = painterResource(id = userpic),
            contentDescription = "Аватар пользователя",
            modifier = Modifier
                .size(38.dp)
                .padding(top = 2.dp),
        )
        Column(
            modifier = Modifier
                .padding(start = 15.dp),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                modifier = Modifier.padding(bottom = 7.dp),
                text = username,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
            Text(
                text = reviewdate,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.sk_modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0x66FFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
    Text(
        modifier = Modifier
            .padding(24.dp, 16.dp, 24.dp, 0.dp)
            .background(color = Color(0xFF050B18)) ,
        text = review,
        style = TextStyle(
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = FontFamily(Font(R.font.sk_modernist)),
            fontWeight = FontWeight(400),
            color = Color(0xFFA8ADB7),
            letterSpacing = 0.5.sp,),
    )
}