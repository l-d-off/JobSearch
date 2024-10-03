package ru.darf.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

object AppTheme {
    val colors: AppColors
        @Composable get() = LocalColors.current
    val typography: AppTypography
        @Composable get() = LocalTypography.current
}

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalColors provides AppColorsValue,
        LocalTypography provides AppTypographyValue,
    ) {
        MaterialTheme(content = content)
    }
}