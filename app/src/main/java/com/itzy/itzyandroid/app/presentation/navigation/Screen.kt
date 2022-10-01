package com.itzy.itzyandroid.app.presentation.navigation

sealed class Screen (val route: String){
    object HomeScreen: Screen("home_screen")
    object PostScreen: Screen("post_screen")
    object PostDetailScreen: Screen("post_detail_screen")
}