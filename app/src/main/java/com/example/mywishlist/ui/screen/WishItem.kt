package com.example.mywishlist.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material.ExperimentalMaterialApi
import com.example.mywishlist.ui.data.Wish

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WishItem(
    wish: Wish,
    onClick: () -> Unit
){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, end = 8.dp, start = 8.dp),
        elevation = 10.dp,
        backgroundColor = Color.White,
        onClick = {  }) {
        Column (
            modifier = Modifier.padding(16.dp)
        ){
        Text(text = wish.title, fontWeight = FontWeight.ExtraBold)
        Text(text = wish.description)
        }
    }
}