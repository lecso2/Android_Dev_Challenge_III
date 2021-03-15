package com.example.androiddevchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.R

@Composable
fun PatternBackground(resourceId: Int, content: @Composable () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Surface(color = MaterialTheme.colors.background) {
            Image(
                painter = painterResource(resourceId),
                "backgroundPattern",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
        }
        content()
    }
}

@Preview
@Composable
fun PatternBackgroundPrev() {
    PatternBackground(R.drawable.ic_login_dark) {
        Text("text field")
    }
}