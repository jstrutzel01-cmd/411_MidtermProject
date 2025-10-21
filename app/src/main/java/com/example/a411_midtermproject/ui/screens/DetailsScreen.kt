// ui/screens/DetailsScreen.kt
package com.example.a411_midtermproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a411_midtermproject.ui.components.DetailedMovieCard
import com.example.a411_midtermproject.viewmodel.MovieViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    viewModel: MovieViewModel,
    movieId: Int,
    onBackClick: () -> Unit
) {
    val movie = viewModel.getMovieById(movieId)
    val isInWatchlist = viewModel.isInWatchlist(movieId)

    if (movie == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Movie not found")
        }
        return
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Movie Details") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            DetailedMovieCard(
                movie = movie,
                isInWatchList = isInWatchlist,
                onWatchListToggle = { viewModel.toggleWatchlist(movie) },
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}