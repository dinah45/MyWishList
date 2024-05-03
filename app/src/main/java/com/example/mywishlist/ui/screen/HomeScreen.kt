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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.mywishlist.R
import androidx.compose.foundation.lazy.items
import com.example.mywishlist.ui.data.DummyWish
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@RootNavGraph(start = true)
@Composable
fun HomeScreen (navigator: DestinationsNavigator){
 Scaffold (
      topBar = {AppBar(title = "Wish List", {

      })},
     floatingActionButton = {
         FloatingActionButton(
             modifier = Modifier.padding(20.dp),
             contentColor = Color.White,
             backgroundColor = colorResource(id = R.color.app_bar_color),
             onClick = { /*TODO*/ }){
             Icon(imageVector = Icons.Default.Add, contentDescription = "")
         }
     }
  ){
      LazyColumn (modifier = Modifier
          .fillMaxSize()
          .padding(it)){
items(DummyWish.wishList){
    wish -> WishItem(wish = wish) {


}
}
      }
  }


    }