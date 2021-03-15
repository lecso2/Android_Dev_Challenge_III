package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.Locale

@Composable
fun RowHeader(title: String) {
    Column(
        modifier = Modifier
            .height(40.dp)
            .padding(16.dp, 0.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(title.toUpperCase(Locale.ROOT), style = MaterialTheme.typography.h2)
    }
}

@Preview
@Composable
fun RowHeaderPrev() {
    RowHeader("title")
}

