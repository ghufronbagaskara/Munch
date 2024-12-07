package com.example.munch.navigation.nav_object

sealed class ParentNavObj(val route: String){
    data object HomeNav: ParentNavObj("home-nav")
    data object AuthNav: ParentNavObj("auth-nav")
}