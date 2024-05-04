package com.example.mywishlist.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.mywishlist.R
import com.example.mywishlist.ui.data.DummyWish
import com.example.mywishlist.ui.screen.destinations.AddScreenDestination
import com.example.mywishlist.ui.screen.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator


@Destination
@Composable
fun HomeScreen(navigator: DestinationsNavigator, viewModel: WishViewModel) {
    Scaffold(
        topBar = {
            AppBar(title = "Wish List", {
            }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navigator.navigate("addScreen") },
                modifier = Modifier.padding(20.dp),
                contentColor = Color.White,
                backgroundColor = colorResource(id = R.color.app_bar_color)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            items(DummyWish.wishList) { wish ->
                WishItem(wish = wish) {
                }
            }
        }
    }
}