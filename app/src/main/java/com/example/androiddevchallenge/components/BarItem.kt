package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BarItem(title: String, vector: ImageVector, selected: Boolean) {
    val iconColor = MaterialTheme.colors.onBackground
    val alpha = if (selected) 1.0f else 0.5f

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.alpha(alpha)) {
        Icon(
            imageVector = vector,
            tint = iconColor,
            contentDescription = title,
            modifier = Modifier.size(18.dp, 18.dp)
        )
        Text(title.toUpperCase(), style = MaterialTheme.typography.caption)
    }
}

@Preview
@Composable
fun BarItemPrev() {
    BarItem("title", Icons.Default.Spa, true)
}