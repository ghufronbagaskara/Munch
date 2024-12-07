package com.example.munch.presentation.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.munch.R
import com.example.munch.navigation.nav_object.AuthNavObj
import com.example.munch.ui.theme.MunchScheme
import com.example.munch.ui.widget.common.ButtonSize
import com.example.munch.ui.widget.common.ButtonType
import com.example.munch.ui.widget.common.CustomButton

@Composable
fun Boarding2Screen(
    authNavController: NavController
) {
    Scaffold(
        containerColor = MunchScheme.White.color
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painterResource(id = R.drawable.onboard_header),
                contentDescription = "header",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp)
            )

            Spacer(modifier = Modifier.height(64.dp))

            Image(
                painterResource(id = R.drawable.boarding2),
                contentDescription = "boarding1",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    "Hilangkan Batas !",
                    color = MunchScheme.Black.color,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    "Hilangkan batasan untuk mengantre. Pilih, pesan, dan nikmati makananmu!!",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(Modifier.height(64.dp))

            ProgressDots(
                progress = 2,
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(Modifier.height(64.dp))

            CustomButton(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp),
                text = "Lanjutkan",
                onClick = {
                    authNavController.navigate(AuthNavObj.Boarding3Screen.route)
                },
                size = ButtonSize.LARGE,
                type = ButtonType.PRIMARY
            )

            Spacer(Modifier.height(8.dp))

            CustomButton(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp),
                text = "Lewati",
                onClick = {
                    authNavController.navigate(AuthNavObj.Boarding3Screen.route)
                },
                size = ButtonSize.LARGE,
                type = ButtonType.TEXT
            )


        }
    }
}