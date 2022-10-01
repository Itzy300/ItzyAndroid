package com.itzy.itzyandroid.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.itzy.itzyandroid.R

private val Roboto = FontFamily(
    Font(R.font.robotoblack, FontWeight.Black), // 900
    Font(R.font.robotobold, FontWeight.Bold), // 700
    Font(R.font.robotolight, FontWeight.Light), //300
    Font(R.font.robotomedium, FontWeight.Medium), // 500
    Font(R.font.robotoregular, FontWeight.Normal), // 400
    Font(R.font.robotothin, FontWeight.Thin) // 100
)

object TextStyles{
    val TextBasics1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    )
    val TextBasics2 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    )
    val TextBasics3 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    )
    val TextSmall1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    )


}
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)