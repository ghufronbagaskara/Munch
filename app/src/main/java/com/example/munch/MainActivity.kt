package com.example.munch

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.munch.navigation.nav_host.AuthNavHost
import com.example.munch.navigation.nav_host.ParentNavHost
import com.example.munch.navigation.nav_object.AuthNavObj
import com.example.munch.navigation.nav_object.ParentNavObj
import com.example.munch.presentation.auth.Boarding1Screen
import com.example.munch.presentation.auth.Boarding2Screen
import com.example.munch.presentation.auth.Boarding3Screen
import com.example.munch.presentation.auth.LoginScreen
import com.example.munch.presentation.auth.RegisterScreen
import com.example.munch.presentation.splash.SplashScreen
import dagger.hilt.android.AndroidEntryPoint
import com.example.munch.ui.theme.Theme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Theme(
                isDarkTheme = false,
                dynamicColor = false,
                content = {
                    Scaffold(
                        modifier = Modifier
                            .fillMaxSize(),
//                            .background(GreventureScheme.White.color),
                        content = { _ -> ParentNavHost() },
                    )
                },
            )
        }
    }
}

