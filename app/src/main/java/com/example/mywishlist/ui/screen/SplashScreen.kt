package com.example.mywishlist.ui.screen

import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.mywishlist.R
import com.example.mywishlist.ui.screen.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

@Destination
@RootNavGraph(start = true)
@Composable
fun SplashScreen(navigator: DestinationsNavigator, viewModel: WishViewModel){
LaunchedEffect(key1 = Unit) {
 delay(2000)
    navigator.navigate(HomeScreenDestination())
}
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.app_bar_color)),
        contentAlignment = Alignment.Center){
        Text("My Wish List",
            fontWeight = FontWeight.ExtraBold,
            overflow = TextOverflow.Ellipsis,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            color = Color.White)
    }
}