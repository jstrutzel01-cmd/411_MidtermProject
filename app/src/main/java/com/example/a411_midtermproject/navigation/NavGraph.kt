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
        composable("home") {
            HomeScreen(
                viewModel = movieViewModel,
                onWatchListClick = { navController.navigate("watchlist") },
                onMovieClick = { movieId ->
                    navController.navigate("details/$movieId")
                }
        ) }
        composable("details/{movieId}") { backStack ->
            val movieId = backStack.arguments?.getString("movieId")?.toInt() ?: 0
            DetailsScreen(
                viewModel = movieViewModel,
                movieId = movieId,
                onBackClick = { navController.navigateUp() }
            )
        }
        composable("watchlist") { WatchlistScreen(navController, movieViewModel) }
    }
}
