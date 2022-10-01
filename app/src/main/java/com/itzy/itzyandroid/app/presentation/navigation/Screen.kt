package com.itzy.itzyandroid.app.presentation.navigation

sealed class Screen (val route: String){
    object HomeScreen: Screen("home_screen")
    object PostScreen: Screen("post_screen")
    object PostDetailScreen: Screen("post_detail_screen")
    object WritePostScreen: Screen("write_post_screen")
    object SearchScreen: Screen("search_screen")
    object SearchResultScreen: Screen("search_result_screen")
}