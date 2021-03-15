
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

val KulimPark = FontFamily(
    Font(R.font.kulim_light, FontWeight.Light),
    Font(R.font.kulim_regular, FontWeight.Normal)
)

val Lato = FontFamily(
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_regular, FontWeight.Normal)
)
// Set of Material typography styles to start with
val LightTypography = Typography(
    h1 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = 1.15.sp,
        color = taupe800
    ),
    h2 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        color = taupe800
    ),
    h3 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        color = black800
    ),
    body1 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        color = gray800
    ),
    button = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
        color = white
    ),
    caption = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 1.15.sp
    )
)

val DarkTypography = Typography(
    h1 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp,
        letterSpacing = 1.15.sp,
        color = taupe100
    ),
    h2 = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        letterSpacing = 1.15.sp,
        color = taupe100
    ),
    h3 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        color = white800
    ),
    body1 = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        color = white800
    ),
    button = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        letterSpacing = 1.15.sp,
        color = gray900
    ),
    caption = TextStyle(
        fontFamily = KulimPark,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 1.15.sp
    )
)
