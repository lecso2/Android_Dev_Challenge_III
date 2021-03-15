package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.models.Calm

@Composable
fun CardRow(title: String, items: List<Calm>) {
    val numberOfItemsPerRow = 3
    val numberOfRows = items.count() / numberOfItemsPerRow

    Column {
        RowHeader(title)
        Spacer(Modifier.size(8.dp))
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(16.dp, 0.dp, 0.dp, 0.dp)
        ) {
            items(numberOfRows) { index ->
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(
                        items.subList(
                            index * numberOfItemsPerRow,
                            (index + 1) * numberOfItemsPerRow
                        )
                    ) { calm ->
                        CardItem(calm)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CardRowPrev() {
    CardRow("title", listOf())
}
