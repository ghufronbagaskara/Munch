package com.example.munch.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.munch.R

val Roboto = FontFamily(
    Font(R.font.roboto_thin, FontWeight.ExtraLight),
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_medium, FontWeight.SemiBold),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_bold, FontWeight.ExtraBold),

    // Italic variants
    Font(R.font.roboto_thin_italic, FontWeight.ExtraLight, FontStyle.Italic),
    Font(R.font.roboto_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.roboto_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.roboto_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.roboto_medium_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.roboto_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.roboto_bold_italic, FontWeight.ExtraBold, FontStyle.Italic)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Roboto,
    ),
    displayMedium = TextStyle(
        fontFamily = Roboto,
    ),
    displaySmall = TextStyle(
        fontFamily = Roboto,
    ),
    bodyLarge = TextStyle(
        fontFamily = Roboto,
    ),
    bodyMedium = TextStyle(
        fontFamily = Roboto,
    ),
    bodySmall = TextStyle(
        fontFamily = Roboto,
    ),
    headlineLarge = TextStyle(
        fontFamily = Roboto,
    ),
    headlineSmall = TextStyle(
        fontFamily = Roboto,
    ),
    labelLarge = TextStyle(
        fontFamily = Roboto,
    ),
    labelSmall = TextStyle(
        fontFamily = Roboto,
    ),
    titleLarge = TextStyle(
        fontFamily = Roboto,
    ),
    titleSmall = TextStyle(
        fontFamily = Roboto,
    ),
    labelMedium = TextStyle(
        fontFamily = Roboto,
    ),
    titleMedium = TextStyle(
        fontFamily = Roboto,
    ),
    headlineMedium = TextStyle(
        fontFamily = Roboto,
    ),

    )

