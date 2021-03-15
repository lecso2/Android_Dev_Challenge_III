package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import java.util.Locale

@Composable
fun Title(title: String, modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            title.toUpperCase(Locale.ROOT),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h1
        )
    }
}

@Preview
@Composable
fun TitlePrev() {
    Title("Title", Modifier)
}
