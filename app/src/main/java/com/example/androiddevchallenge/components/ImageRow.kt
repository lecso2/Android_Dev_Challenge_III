package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.models.Calm
import com.example.androiddevchallenge.models.EXAMPLE_ITEM

@Composable
fun ImageRow(title: String, items: List<Calm>) {
    Column {
        RowHeader(title)
        Spacer(Modifier.size(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 0.dp)
        ) {
            items(items) { calm ->
                ImageItem(calm)
            }
        }
    }
}

@Preview
@Composable
fun ImageRowPrev() {
    ImageRow("title", listOf(EXAMPLE_ITEM, EXAMPLE_ITEM, EXAMPLE_ITEM, EXAMPLE_ITEM))
}
