package com.itzy.itzyandroid.app.presentation.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.itzy.itzyandroid.R
import com.itzy.itzyandroid.app.presentation.component.PostItem
import com.itzy.itzyandroid.app.presentation.component.PostTitle
import com.itzy.itzyandroid.app.presentation.navigation.Screen

@Composable
fun SearchResultScreen(
    navController: NavController
){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(16.dp, 28.dp)
            .fillMaxSize()
    ) {
        PostTitle(title = "검색어 아무거나", resId = R.drawable.search2)
        Spacer(modifier = Modifier.padding(top = 20.dp))
        for (i in 1..10){
            PostItem(modifier = Modifier
                .padding(vertical = 10.dp)
                .fillMaxWidth()
                .clickable { navController.navigate(Screen.PostDetailScreen.route) })
        }
    }
}