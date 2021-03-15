package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.components.BottomBar
import com.example.androiddevchallenge.components.CardRow
import com.example.androiddevchallenge.components.ImageRow
import com.example.androiddevchallenge.components.SearchField
import com.example.androiddevchallenge.models.alignBodyItems
import com.example.androiddevchallenge.models.alignMindItems
import com.example.androiddevchallenge.models.favoriteItems
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun Home(navController: NavController = rememberNavController()) {
    Surface(color = MaterialTheme.colors.background) {
        Box {
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.size(56.dp))
                SearchField()
                CardRow(stringResource(id = R.string.title_header_favorites), favoriteItems)
                Spacer(Modifier.size(16.dp))
                ImageRow(stringResource(id = R.string.title_header_align_body), alignBodyItems)
                Spacer(Modifier.size(8.dp))
                ImageRow(stringResource(id = R.string.title_header_align_mind), alignMindItems)
            }
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxSize()) {
                BottomBar()
            }
        }
    }
}

@Preview("Home Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeLightPreview() {
    MyTheme {
        Home()
    }
}

@Preview("Home Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeDarkPreview() {
    MyTheme(darkTheme = true) {
        Home()
    }
}
