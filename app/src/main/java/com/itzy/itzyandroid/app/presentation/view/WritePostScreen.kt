package com.itzy.itzyandroid.app.presentation.view

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app.presentation.component.PostTitle
import com.itzy.itzyandroid.ui.theme.MainBlue
import com.itzy.itzyandroid.ui.theme.MainGray2
import com.itzy.itzyandroid.ui.theme.MainGray3
import com.itzy.itzyandroid.ui.theme.Shapes
import com.itzy.itzyandroid.ui.theme.TextStyles.TextBasics4
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall1

@Composable
fun WritePostScreen(
    navController: NavController
){
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
        .padding(16.dp, 28.dp)
        .fillMaxSize()
        .verticalScroll(scrollState)
    ) {
        Column {
            PostTitle(title = "글 작성하기", resId = R.drawable.add_post)
            Text(
                text = "제목",
                style = TextBasics4,
                color = MainGray3,
                modifier = Modifier.padding(top = 30.dp, bottom = 20.dp)
            )
            Divider(modifier = Modifier.fillMaxWidth().height(0.5.dp), color = MainGray2)
            Text(
                text = "내용을 입력하세요",
                style = TextSmall1,
                color = MainGray3,
                modifier = Modifier.padding(vertical = 20.dp)
            )
            Spacer(modifier = Modifier.height(120.dp))

        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(MainBlue),
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .fillMaxWidth(0.5f)
                .height(40.dp),
            shape = Shapes.small
        ) {
            Text(
                text = "댓글 달기",
                style = TextBasics4,
                color = Color.White
            )
        }
    }
}