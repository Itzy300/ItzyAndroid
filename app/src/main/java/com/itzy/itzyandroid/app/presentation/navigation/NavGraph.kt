package com.itzy.itzyandroid.app.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.itzy.itzyandroid.app.presentation.view.HomeScreen

fun NavGraphBuilder.itzyGraph(
    navController: NavController
){
    composable(
        route = Screen.HomeScreen.route
    ) {
        HomeScreen(navController)
    }
}