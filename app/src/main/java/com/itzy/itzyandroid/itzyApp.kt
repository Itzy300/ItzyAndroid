package com.itzy.itzyandroid


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.itzy.itzyandroid.app.presentation.navigation.Screen
import com.itzy.itzyandroid.app.presentation.navigation.itzyGraph
import com.itzy.itzyandroid.ui.theme.ITZYtheme

@Composable
fun itzyApp(){
    ITZYtheme {
        Surface(
            color = MaterialTheme.colors.background
        ){
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = Screen.HomeScreen.route
            ) {
                itzyGraph(
                    navController = navController
                )
            }
        }
    }
}
