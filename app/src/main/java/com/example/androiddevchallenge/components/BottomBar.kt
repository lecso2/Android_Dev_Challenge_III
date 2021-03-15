package com.example.androiddevchallenge.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun BottomBar() {
    Box(Modifier.fillMaxWidth()) {
        Surface(
            modifier = Modifier.height(56.dp),
            color = MaterialTheme.colors.background,
            elevation = 8.dp
        ) {
        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BarItem(stringResource(id = R.string.tab_home), Icons.Default.Spa, true)
            PlayButton(modifier = Modifier.absoluteOffset(0.dp, (-28).dp))
            BarItem(
                stringResource(id = R.string.tab_profile),
                Icons.Default.AccountCircle,
                false
            )
        }
    }
}

@Preview
@Composable
fun BottomBarPrev() {
    BottomBar()
}