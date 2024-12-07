package com.example.munch.presentation.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.munch.R
import com.example.munch.navigation.nav_object.AuthNavObj
import com.example.munch.ui.theme.MunchScheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    authNavController: NavController,
    parentNavController: NavController,
//    profileViewModel: ProfileViewModel
) {
//    Text("SplashScreen")
//    val user = profileViewModel.user.collectAsState(initial = Pair("", null)).value.second

    var showLogo by remember { mutableStateOf(true) }
    var showBlueScreen by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(3000)
        showLogo = false
        showBlueScreen = true
        delay(1000)
//        if (user?.email != null) {
//            parentNavCtr.navigate(ParentNavObj.HomeNav.route)
//        } else {
//            authNavCtr.navigate(AuthNavObj.Boarding1.route)
//        }
        authNavController.navigate(AuthNavObj.Boarding1Screen.route)
    }

    if (showBlueScreen) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MunchScheme.Primary.color
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

            }
        }
    } else {
        // Show the splash screen with logo
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MunchScheme.White.color
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AnimatedVisibility(
                    visible = showLogo,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.app_logo),
                        contentDescription = "app_logo"
                    )
                }
            }
        }
    }



}
