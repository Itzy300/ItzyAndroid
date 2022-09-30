package com.itzy.itzyandroid.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val ColorPalette = lightColors(
    primary = MainBlue,
    primaryVariant = Color.White,
    secondary = MainGray1
)

@Composable
fun ITZYtheme(content: @Composable () -> Unit){

    MaterialTheme(
        colors = ColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}