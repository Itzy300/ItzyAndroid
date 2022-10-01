package com.itzy.itzyandroid.app.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.ui.theme.*

@Composable
fun PostItem(
    modifier: Modifier = Modifier,
    title: String = "게시글 제목입니다 이건제목",
    content: String = "게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용",
    like: Int = 0,
    comment: Int = 0
){
    Column(
        modifier = modifier
    ){
        Text(
            text = title,
            style = TextStyles.TextBasics2,
            color = Color.Black,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = content,
            style = TextStyles.TextSmall1,
            color = MainGray3,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row(
          modifier = Modifier.align(End)
        ){
            Image(
                painterResource(id = R.drawable.like),
                contentDescription = "like image",
                modifier = Modifier.size(21.dp)
            )
            Text(
                text = like.toString(),
                style = TextStyles.TextSmall1,
                color = MainGray3,
                modifier = Modifier.padding(start = 7.dp, end = 10.dp)
            )
            Image(
                painterResource(id = R.drawable.message),
                contentDescription = "comment image",
                modifier = Modifier.size(21.dp)
            )
            Text(
                text = comment.toString(),
                style = TextStyles.TextSmall1,
                color = MainGray3,
                modifier = Modifier.padding(start = 7.dp, end = 10.dp)
            )
        }
        Divider(
            modifier = Modifier
                .padding(top = 7.dp)
                .fillMaxWidth(),
            thickness = 0.5.dp,
            color = MainGray2
        )
    }
}

