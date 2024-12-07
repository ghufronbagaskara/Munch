package com.example.munch.presentation.auth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.munch.R
import com.example.munch.ui.theme.MunchScheme
import com.example.munch.ui.theme.Roboto
import com.example.munch.ui.widget.common.InputField


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(
    authNavController: NavController,
    parentNavController: NavController,
) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

//    val email = viewModel.email.collectAsState(initial = "")
//    val password = viewModel.password.collectAsState(initial = "")


    Scaffold(
        containerColor = MunchScheme.White.color,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.header_auth),
                contentDescription = "header",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(60.dp))

            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 42.dp)
            ) {
                Text(
                    "Selamat Datang Kembali!",
                    color = MunchScheme.Black.color,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    fontFamily = Roboto

                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "Masuk akun untuk melanjutkan",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Start,
                    fontFamily = Roboto
                )
            }

            Spacer(Modifier.height(24.dp))

            InputField(
                value = email.value,
                placeholder = "Masukkan Email",
                onValueChange = { email.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                keyboardType = KeyboardType.Email
            )

            Spacer(Modifier.height(14.dp))

            InputField(
                value = password.value,
                placeholder = "Password",
                onValueChange = { password.value = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp),
                keyboardType = KeyboardType.Password,
                visualTransformation = PasswordVisualTransformation()
            )



        }
    }
}