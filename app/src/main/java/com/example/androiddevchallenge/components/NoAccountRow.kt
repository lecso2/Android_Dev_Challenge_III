package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun NoAccountRow() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(32.dp),
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Bottom
    ) {
        Text(
            stringResource(id = R.string.notice_no_account),
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground
        )
        Spacer(Modifier.size(2.dp))
        Text(
            stringResource(id = R.string.button_signup),
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.onBackground,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Preview
@Composable
fun NoAccountRowPrev() {
    NoAccountRow()
}
