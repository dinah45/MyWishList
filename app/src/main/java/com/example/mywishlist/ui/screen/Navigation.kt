package com.example.mywishlist.ui.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.example.mywishlist.ui.data.Wish

@Composable
fun Navigation(viewModel: WishViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
               navController: NavController = rememberNavController())