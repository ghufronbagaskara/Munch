package com.example.munch.navigation.nav_host

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.munch.navigation.nav_object.ParentNavObj

@Composable
fun ParentNavHost() {
    val parentNavController = rememberNavController()

    NavHost(
        navController = parentNavController,
        startDestination = ParentNavObj.AuthNav.route
    ){
        composable(ParentNavObj.AuthNav.route) {
            AuthNavHost(parentNavController)
        }
    }
}