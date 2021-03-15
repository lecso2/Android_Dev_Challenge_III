package com.example.androiddevchallenge.screens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.LoginField
import com.example.androiddevchallenge.components.MainButton
import com.example.androiddevchallenge.components.NoAccountRow
import com.example.androiddevchallenge.components.PatternBackground
import com.example.androiddevchallenge.components.Title
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Login(navController: NavController = rememberNavController()) {
    PatternBackground(resourceId = if (isSystemInDarkTheme()) R.drawable.ic_login_dark else R.drawable.ic_login) {
        Column(
            Modifier
                .padding(16.dp, 0.dp)
                .fillMaxWidth()
        ) {
            Title(
                title = stringResource(id = R.string.button_login),
                modifier = Modifier.height(200.dp)
            )
            Spacer(Modifier.size(32.dp))
            LoginField(stringResource(id = R.string.input_email))
            Spacer(Modifier.size(8.dp))
            LoginField(stringResource(id = R.string.input_password))
            Spacer(Modifier.size(8.dp))
            MainButton(
                title = stringResource(id = R.string.button_login),
                onClick = {
                    navController.navigate("home")
                }
            )
            NoAccountRow()
        }
    }
}

@Preview("Login Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginLightPreview() {
    MyTheme {
        Login()
    }
}

@Preview("Login Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginDarkPreview() {
    MyTheme(darkTheme = true) {
        Login()
    }
}
