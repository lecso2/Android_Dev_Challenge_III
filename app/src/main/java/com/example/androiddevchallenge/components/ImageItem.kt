package com.example.androiddevchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Calm
import com.example.androiddevchallenge.models.EXAMPLE_ITEM

@Composable
fun ImageItem(calm: Calm) {
    val title = stringResource(id = calm.titleId)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(shape = CircleShape) {
            Image(
                painter = painterResource(calm.imageId),
                title,
                modifier = Modifier.size(88.dp, 88.dp),
                contentScale = ContentScale.Crop
            )
        }
        Column(
            Modifier
                .height(24.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(title, style = MaterialTheme.typography.h3, textAlign = TextAlign.Center)
        }
    }
}

@Preview
@Composable
fun ImageItemPrev() {
    ImageItem(EXAMPLE_ITEM)
}