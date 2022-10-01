package com.itzy.itzyandroid.app.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app.presentation.component.MainPostItem
import com.itzy.itzyandroid.app.presentation.component.PostItem
import com.itzy.itzyandroid.ui.theme.MainBlue
import com.itzy.itzyandroid.ui.theme.TextStyles

@Composable
fun PostScreen(
    navController: NavController
){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(16.dp, 28.dp)
            .fillMaxSize()
    ){
        PostTitle(title = "시각장애인 게시판")
        Row(
            modifier = Modifier
                //  .align(CenterHorizontally)
                .padding(30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            MainPostItem(
                resId = R.drawable.add_post,
                title = "글쓰기",
                onClick = {}
            )
            Spacer(modifier = Modifier.width(20.dp))
            MainPostItem(
                resId = R.drawable.search,
                title = "검색하기",
                onClick = {}
            )
        }
        for (i in 1..10){
            PostItem(modifier = Modifier
                .padding(20.dp, 10.dp)
                .fillMaxWidth())
        }
    }
}

@Composable
fun PostTitle(
    title: String = "게시판"
){
    Row{
        Image(
            painter = painterResource(id = R.drawable.bookmark),
            contentDescription = "bookmark image",
            modifier = Modifier
                .padding(end = 10.dp)
                .size(33.dp)
        )
        Text(
            text = title,
            style = TextStyles.TextBasics1,
            color = MainBlue,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

