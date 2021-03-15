package com.example.androiddevchallenge.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.models.Calm
import com.example.androiddevchallenge.models.EXAMPLE_ITEM

@Composable
fun CardItem(calm: Calm) {
    val title = stringResource(id = calm.titleId)

    Surface(
        Modifier.size(192.dp, 56.dp), shape = MaterialTheme.shapes.small,
        color = if (isSystemInDarkTheme()) MaterialTheme.colors.surface else MaterialTheme.colors.onPrimary
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(calm.imageId),
                title,
                modifier = Modifier.size(56.dp, 56.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.size(16.dp))
            Text(title, style = MaterialTheme.typography.h3)
            Spacer(modifier = Modifier.size(16.dp))
        }
    }
}

@Preview
@Composable
fun CardItemPrev() {
    CardItem(EXAMPLE_ITEM)
}