package ru.darf.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class AppColors(
    val black: Color,
    val grey1: Color,
    val grey2: Color,
    val grey3: Color,
    val grey4: Color,
    val grey5: Color,
    val white: Color,
    val blue: Color,
    val darkBlue: Color,
    val green: Color,
    val darkGreen: Color,
    val red: Color,
    val shadows: Color,
)

val AppColorsValue = AppColors(
    black = Color(0xff000000),
    grey1 = Color(0xff222325),
    grey2 = Color(0xff313234),
    grey3 = Color(0xff858688),
    grey4 = Color(0xff9f9f9f),
    grey5 = Color(0xffdbdbdb),
    white = Color(0xffffffff),
    blue = Color(0xff2b7efe),
    darkBlue = Color(0xff00427d),
    green = Color(0xff4CB24E),
    darkGreen = Color(0xff015905),
    red = Color(0xffff0000),
    shadows = Color(0xff0c0c0c).copy(alpha = 0.9f),
)

internal val LocalColors = staticCompositionLocalOf { AppColorsValue }