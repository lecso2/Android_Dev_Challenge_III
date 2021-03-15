package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.Locale

@Composable
fun MainButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
) {
    Button(
        colors = colors,
        onClick = onClick,
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .height(72.dp)
            .fillMaxWidth()
    ) {
        Text(title.toUpperCase(Locale.ROOT), style = MaterialTheme.typography.button)
    }
}

@Preview
@Composable
fun MainButtonPrev() {
    MainButton("title", {})
}