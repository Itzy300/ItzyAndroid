package com.itzy.itzyandroid.app.presentation.navigation

sealed class Screen (val route: String){
    object HomeScreen: Screen("home_screen")
    object PostScreen: Screen("post_screen")
}