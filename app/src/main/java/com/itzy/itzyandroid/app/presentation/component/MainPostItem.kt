package com.itzy.itzyandroid.app.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.ui.theme.MainBlue2
import com.itzy.itzyandroid.ui.theme.MainGray2
import com.itzy.itzyandroid.ui.theme.Shapes
import com.itzy.itzyandroid.ui.theme.TextStyles


@Composable
fun MainPostItem(
    modifier: Modifier = Modifier,
    @DrawableRes resId: Int = R.drawable.info,
    title: String = "게시판",
    onClick: () -> Unit = {}
){
    Column(
        modifier = modifier
            .clip(shape = Shapes.small)
            .background(MainBlue2)
            .size(100.dp, 115.dp)
            .border(0.5.dp, MainGray2, shape = Shapes.small)
            .padding(top = 15.dp, bottom = 10.dp)
            .clickable(onClick = onClick)
    ){
        Image(
            painter = painterResource(id = resId),
            contentDescription = title,
            modifier = Modifier
                .size(55.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            color = Color.Black,
            style = TextStyles.TextBasics3,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 15.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}
