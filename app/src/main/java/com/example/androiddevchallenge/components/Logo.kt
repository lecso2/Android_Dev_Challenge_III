package com.example.androiddevchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R

@Composable
fun Logo() {
    val patternId = if (isSystemInDarkTheme()) R.drawable.ic_logo_dark else R.drawable.ic_logo

    Image(
        painter = painterResource(patternId),
        contentDescription = "logo",
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.Fit
    )
}

@Preview
@Composable
fun LogoPrev() {
    Logo()
}
