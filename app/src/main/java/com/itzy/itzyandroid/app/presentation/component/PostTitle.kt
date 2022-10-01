package com.itzy.itzyandroid.app.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.ui.theme.MainBlue
import com.itzy.itzyandroid.ui.theme.TextStyles


@Composable
fun PostTitle(
    title: String = "게시판",
    @DrawableRes resId: Int = R.drawable.bookmark
){
    Row{
        Image(
            painter = painterResource(id = resId),
            contentDescription = "bookmark image",
            modifier = Modifier
                .padding(end = 10.dp)
                .size(33.dp)
        )
        Text(
            text = title,
            style = TextStyles.TextBasics1,
            fontWeight = Bold,
            color = MainBlue,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

