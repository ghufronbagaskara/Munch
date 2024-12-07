package com.example.munch.navigation.nav_object

sealed class AuthNavObj(val route: String){
    data object Splash: AuthNavObj("splash")
    data object Boarding1Screen: AuthNavObj("boarding-1")
    data object Boarding2Screen: AuthNavObj("boarding-2")
    data object Boarding3Screen: AuthNavObj("boarding-3")
    data object Register: AuthNavObj("register")
    data object Login: AuthNavObj("login")
}