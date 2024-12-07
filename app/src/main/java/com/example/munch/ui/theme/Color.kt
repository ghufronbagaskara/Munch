package com.example.munch.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val lightColorScheme = lightColorScheme()
val darkColorScheme = darkColorScheme()

sealed class MunchScheme(val color: Color){
    data object Primary: MunchScheme(Color(0xFF006aff))
    data object PrimaryVariant1: MunchScheme(Color(0xFF006aff))
    data object PrimaryVariant2: MunchScheme(Color(0xFF4d97ff))
//    data object PrimaryVariant3: MunchScheme(Color(0xFF33744E))
//    data object PrimaryVariant4: MunchScheme(Color(0xFF193A27))

    data object Secondary: MunchScheme(Color(0xFF8E8C8C))
    data object SecondaryVariant1: MunchScheme(Color(0xFFd9d9d9))
//    data object SecondaryVariant2: MunchScheme(Color(0xFF3055A0))
//    data object SecondaryVariant3: MunchScheme(Color(0xFF45BFBE))

    data object Tertiary: MunchScheme(Color(0xFFffae00))

    data object Success: MunchScheme(Color(0xFF00C566))
    data object Error: MunchScheme(Color(0xFFff0000))

    data object White: MunchScheme(Color(0xFFFFFFFF))
    data object Black: MunchScheme(Color(0xFF111111))
}