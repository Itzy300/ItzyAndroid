package com.itzy.itzyandroid.app.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.itzy.itzyandroid.app.presentation.view.*

fun NavGraphBuilder.itzyGraph(
    navController: NavController
){
    composable(
        route = Screen.HomeScreen.route
    ) {
        HomeScreen(navController)
    }
    composable(
        route = Screen.PostScreen.route
    ) {
        PostScreen(navController)
    }
    composable(
        route = Screen.PostDetailScreen.route
    ) {
        PostDetailScreen(navController)
    }
    composable(
        route = Screen.WritePostScreen.route
    ) {
        WritePostScreen(navController)
    }
    composable(
        route = Screen.SearchScreen.route
    ) {
        SearchScreen(navController)
    }
    composable(
        route = Screen.SearchResultScreen.route
    ) {
        SearchResultScreen(navController)
    }
}