package com.itzy.itzyandroid.app.presentation.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app.presentation.component.PostTitle
import com.itzy.itzyandroid.app.presentation.navigation.Screen
import com.itzy.itzyandroid.ui.theme.*
import com.itzy.itzyandroid.ui.theme.TextStyles.TextBasics3
import com.itzy.itzyandroid.ui.theme.TextStyles.TextSmall1

@Composable
fun SearchScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(16.dp, 28.dp)
            .fillMaxSize()
    ) {
        PostTitle(title = "검색하기", resId = R.drawable.search2)
        Text(
            text = "글, 제목, 내용 등을 검색하세요.",
            style = TextBasics3,
            color = MainGray3,
            maxLines = 1,
            modifier = Modifier.padding(top = 35.dp, bottom = 18.dp)
        )
        Divider(modifier = Modifier
            .fillMaxWidth()
            .height(0.5.dp), color = MainGray2)
        Button(
            onClick = {navController.navigate(Screen.SearchResultScreen.route)},
            colors = ButtonDefaults.buttonColors(MainBlue),
            modifier = Modifier
                .padding(top = 20.dp)
                .align(End)
                .fillMaxWidth(0.5f)
                .height(40.dp),
            shape = Shapes.small
        ) {
            Text(
                text = "검색하기",
                style = TextStyles.TextBasics4,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Icon(
                painterResource(id = R.drawable.search),
                contentDescription = "search image",
                tint = MainGray2,
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = "게시판의 글을 검색해보세요",
                style = TextSmall1,
                color = MainGray2,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
    }
}
