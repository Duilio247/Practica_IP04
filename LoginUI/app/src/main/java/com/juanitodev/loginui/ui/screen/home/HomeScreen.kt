package com.juanitodev.loginui.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.juanitodev.loginui.ui.components.ActionButton
import com.juanitodev.loginui.ui.theme.PrimaryGreen
import com.juanitodev.loginui.ui.theme.PrimaryGreenDark
import com.juanitodev.loginui.ui.theme.PrimaryPinkDark
import com.juanitodev.loginui.ui.theme.PrimaryViolet
import com.juanitodev.loginui.ui.util.KonfettiUtil
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onRestartFlowClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryViolet,
                    1f to PrimaryGreen
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        Greetings()
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = "Presione para reiniciar",
            isNavigationArrowVisible = false,
            onClicked = onRestartFlowClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryGreenDark,
                contentColor = Color.White
            ),
            shadowColor = PrimaryPinkDark,
            modifier = Modifier.padding(24.dp)
        )
    }
    KonfettiView(
        modifier = Modifier.fillMaxSize(),
        parties = KonfettiUtil.parade()
    )
}

@Composable
private fun Greetings(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Gracias por iniciar!",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        //Emoji
        Text(
            text = "\uD83E\uDD73",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black
        )
    }
}