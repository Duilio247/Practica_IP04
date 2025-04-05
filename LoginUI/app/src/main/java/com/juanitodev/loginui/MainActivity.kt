package com.juanitodev.loginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.juanitodev.loginui.ui.screen.container.ScreenContainer
import com.juanitodev.loginui.ui.theme.LoginAppUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppUiTheme {
                ScreenContainer()
            }
        }
    }
}