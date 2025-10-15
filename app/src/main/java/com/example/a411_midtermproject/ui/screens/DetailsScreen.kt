package com.example.a411_midtermproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a411_midtermproject.data.model.Movie
import com.example.a411_midtermproject.viewmodel.MovieViewModel
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    navController: NavController,
    movieId: Int,
    viewModel: MovieViewModel
) {
    val movie: Movie? = viewModel.getMovieById(movieId)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(movie?.title ?: "Movie Details") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        movie?.let { m ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = m.title, style = MaterialTheme.typography.headlineMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = m.description)
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { viewModel.toggleWatchlist(m) }) {
                    Text(if (m.isInWatchlist) "Remove from Watchlist" else "Add to Watchlist")
                }
            }
        } ?: Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text("Movie not found")
        }
    }
}
