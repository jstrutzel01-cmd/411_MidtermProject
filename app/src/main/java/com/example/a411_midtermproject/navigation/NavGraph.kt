package com.example.a411_midtermproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.a411_midtermproject.ui.screens.*
import com.example.a411_midtermproject.viewmodel.MovieViewModel

@Composable
fun NavGraph(navController: NavHostController, movieViewModel: MovieViewModel) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController, movieViewModel) }
        composable("details/{movieId}") { backStack ->
            val movieId = backStack.arguments?.getString("movieId")?.toInt() ?: 0
            DetailsScreen(navController, movieId, movieViewModel)
        }
        composable("watchlist") { WatchlistScreen(navController, movieViewModel) }
    }
}
