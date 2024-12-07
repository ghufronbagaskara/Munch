package com.example.munch.navigation.nav_host

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.munch.navigation.nav_object.AuthNavObj
import com.example.munch.presentation.auth.Boarding1Screen
import com.example.munch.presentation.auth.Boarding2Screen
import com.example.munch.presentation.auth.Boarding3Screen
import com.example.munch.presentation.auth.LoginScreen
import com.example.munch.presentation.auth.RegisterScreen
import com.example.munch.presentation.splash.SplashScreen

@Composable
fun AuthNavHost(
    parentNavController: NavController = rememberNavController()
) {
    val authNavController = rememberNavController()

    NavHost(
        navController = authNavController,
        startDestination = AuthNavObj.Login.route
    ){
        composable(AuthNavObj.Splash.route){
            SplashScreen(parentNavController = parentNavController, authNavController = authNavController)
        }

        composable(AuthNavObj.Boarding1Screen.route){
            Boarding1Screen(authNavController = authNavController)
        }

        composable(AuthNavObj.Boarding2Screen.route){
            Boarding2Screen(authNavController = authNavController)
        }

        composable(AuthNavObj.Boarding3Screen.route){
            Boarding3Screen(parentNavController = parentNavController, authNavController = authNavController)
        }

        composable(AuthNavObj.Login.route){
            LoginScreen(parentNavController = parentNavController, authNavController = authNavController)
        }

        composable(AuthNavObj.Register.route){
            RegisterScreen(authNavController = authNavController)
        }
    }
}