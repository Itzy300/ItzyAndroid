package com.itzy.itzyandroid.app.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.ui.theme.MainGray3
import com.itzy.itzyandroid.ui.theme.TextStyles

@Composable
fun LikeComment(
    modifier: Modifier = Modifier,
    like: Int = 0,
    comment: Int = 0,
    size: Dp = 21.dp,
){
    Row(
        modifier = modifier
    ) {
        Icon(
            painterResource(id = R.drawable.like),
            contentDescription = "like image",
            modifier = Modifier.size(size),
            tint = MainGray3
        )
        Text(
            text = like.toString(),
            style = TextStyles.TextSmall1,
            color = MainGray3,
            modifier = Modifier.align(CenterVertically).padding(start = 7.dp, end = 10.dp)
        )
        Icon(
            painterResource(id = R.drawable.message),
            contentDescription = "comment image",
            modifier = Modifier.size(size),
            tint = MainGray3
        )
        Text(
            text = comment.toString(),
            style = TextStyles.TextSmall1,
            color = MainGray3,
            modifier = Modifier.align(CenterVertically).padding(start = 7.dp, end = 10.dp)
        )
    }
}