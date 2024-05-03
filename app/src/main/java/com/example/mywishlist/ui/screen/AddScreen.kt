package com.example.mywishlist.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mywishlist.ui.data.WishTextField
import com.example.mywishlist.ui.screen.destinations.AddScreenDestination
import com.example.mywishlist.ui.screen.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun AddScreen(
    id: Long,
    viewModel: WishViewModel,
    navigator: DestinationsNavigator
){
    Scaffold (
        topBar = {
            AppBar(title =
            if (id != 0L) "UpdateWish" else " Add Wish"
            )
        }
    ){
        Column (
            modifier = Modifier
                .padding(it)
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.height(10.dp))

            WishTextField(
                label = "Title",
                value = viewModel.wishTitleState,
                onValueChanged = { viewModel.onWishTitleChanged(it)})
            WishTextField(
                label = "Title",
                value = viewModel.wishDescriptionState,
                onValueChanged = { viewModel.onWishDescriptionChanged(it)})

            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {
                if (viewModel.wishTitleState.isNotEmpty() &&
                    viewModel.wishDescriptionState.isNotEmpty()
                ) {
//                        TODO Update wish
                } else {
//                        TODO Add Wish
                }
            }
            )
                {
                Text(text = if (id != 0L)
                "Update Wish"
                    else "Add Wish",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            }
        } }