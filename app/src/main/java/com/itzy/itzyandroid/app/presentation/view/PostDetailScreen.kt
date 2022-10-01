package com.itzy.itzyandroid.app.presentation.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app.presentation.component.CommentItem
import com.itzy.itzyandroid.app.presentation.component.ItzyImage
import com.itzy.itzyandroid.app.presentation.component.LikeComment
import com.itzy.itzyandroid.app.presentation.component.PostTitle
import com.itzy.itzyandroid.ui.theme.*
import com.itzy.itzyandroid.ui.theme.TextStyles.TextBasics4
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall1
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall2

@Composable
fun PostDetailScreen(
    navController: NavController
){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp, 28.dp)
    ){
        PostTitle(title = "시각장애인 게시판")
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(11.dp)
        ){
            Profile(
                modifier = Modifier
                    .weight(3.5f)
                    .align(CenterVertically)
                    .clip(Shapes.small)
                    .height(55.dp)
                    .border(0.5.dp, Black, Shapes.small)
            )
            DetailEditButton(modifier = Modifier.weight(1f))
            DetailEditButton(
                modifier = Modifier.weight(1f),
                text = "삭제하기",
                resId = R.drawable.delete,
                color = MainRed1
            )
        }
        DetailContent()
        WriteComment(modifier = Modifier
            .padding(top = 27.dp, bottom = 14.dp)
            .height(100.dp)
            .fillMaxWidth()
            .clip(Shapes.small)
            .border(0.5.dp, MainGray2, Shapes.small)
            .background(MainGray4)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(MainBlue),
            modifier = Modifier.align(End).fillMaxWidth(0.5f).height(40.dp),
            shape = Shapes.small
        ){
            Text(
                text = "댓글 달기",
                style =TextBasics4,
                color = White
            )
        }
        Spacer(modifier = Modifier.padding(bottom = 30.dp))
        for (i in 1..10){
            CommentItem(modifier = Modifier.fillMaxWidth())
        }
    }
}

@Composable
fun Profile(
    modifier: Modifier = Modifier,
    nickname: String = "작성자 닉네임",
    disabled: String = "시각 장애인"
){
    Row(
        modifier = modifier.padding(13.dp,10.dp)
    ){
        ItzyImage(modifier = Modifier.size(36.dp))
        Spacer(modifier = Modifier.width(7.dp))
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .align(CenterVertically)
        ){
            Text(
                text = nickname,
                style = TextSmall1,
                fontWeight = Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = disabled,
                style = TextSmall2,
                color = MainGray2,
            )
        }
    }
}
@Composable
fun DetailEditButton(
    modifier: Modifier = Modifier,
    @DrawableRes resId: Int = R.drawable.edit,
    text: String = "수정하기",
    color: Color = MainBlue
){
    Column(
        modifier = modifier
            .height(55.dp)
            .border(0.5.dp, color, Shapes.small)
    ){
        Icon(
            painterResource(id = resId),
            contentDescription = text,
            tint = color,
            modifier = Modifier
                .padding(top = 8.dp)
                .align(CenterHorizontally)
                .size(22.dp)
        )
        Text(
            text = text,
            style = TextSmall2,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 6.dp)
                .align(CenterHorizontally)
        )
    }
}

@Composable
fun DetailContent(
    modifier: Modifier = Modifier,
    title: String = "게시물제목",
    content: String = "게시물내용게시게시물제목물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용게시물내용",
    time: String = "2022년 8월 18일 18: 30",
    like: Int = 1,
    comment: Int = 1
){
    Column(
          modifier = modifier
    ){
        Text(
            text = title,
            style = TextBasics4,
            modifier = Modifier.padding(top = 30.dp, bottom = 6.dp),
        )
        Divider(
            modifier = Modifier
                .padding(bottom = 20.dp)
                .height(1.dp)
                .fillMaxWidth(),
            color = MainGray2)
        Text(
            text = content,
            style = TextSmall1,
            color = MainGray3
        )
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = time,
            style = TextSmall1,
            color = MainGray2,
            modifier = Modifier.align(End)
        )
        LikeComment(
            modifier = Modifier.align(End).padding(top = 15.dp),
            size = 33.dp
        )
    }
}

@Composable
fun WriteComment(
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier
    ){
        Text(
            text = "댓글을 입력하세요.",
            style = TextSmall1,
            color = MainGray3,
            modifier = Modifier.padding(10.dp)
        )
    }
}