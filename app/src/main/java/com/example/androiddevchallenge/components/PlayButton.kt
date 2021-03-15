package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PlayButton(modifier: Modifier) {
    Box(modifier.size(56.dp, 56.dp)) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.primary,
            shape = CircleShape
        ) {
        }
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Default.PlayArrow,
                tint = MaterialTheme.colors.onPrimary,
                contentDescription = "play",
                modifier = Modifier.size(24.dp, 24.dp)
            )
        }
    }
}

@Preview
@Composable
fun PlayButtonPrev() {
    PlayButton(Modifier)
}
