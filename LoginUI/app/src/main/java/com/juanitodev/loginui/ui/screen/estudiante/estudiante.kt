package com.juanitodev.loginui.ui.screen.estudiante

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import com.juanitodev.loginui.R
import com.juanitodev.loginui.ui.components.AuthenticationScreenTemplate
import com.juanitodev.loginui.ui.theme.AestheticBlue
import com.juanitodev.loginui.ui.theme.AestheticBlueLight
import com.juanitodev.loginui.ui.theme.AestheticWhite
import com.juanitodev.loginui.ui.theme.PrimaryPinkDark
import com.juanitodev.loginui.ui.theme.PrimaryPinkLight
import androidx.compose.material3.ButtonDefaults

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit = {},
    onRegistrationClicked: () -> Unit = {}
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to AestheticBlueLight,
            0.5f to AestheticBlue,
            1f to AestheticWhite
        ),
        imgRes = R.drawable.estudiante,
        title = "Bienvenido estudiante!",
        subtitle = "Por favor, inicia sesión",
        mainActionButtonTitle = "ACCEDER",
        secondaryActionButtonTitle = "Modo Vigilante",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegistrationClicked
    )
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(modifier = Modifier.fillMaxSize())
}
