package com.example.a411_midtermproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a411_midtermproject.ui.components.SimpleMovieCard
import com.example.a411_midtermproject.viewmodel.MovieViewModel
import com.example.a411_midtermproject.ui.theme.NiceBlue
import com.example.a411_midtermproject.ui.theme.NiceGray


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: MovieViewModel,
    onWatchListClick: () -> Unit,
    onMovieClick: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Movie Explorer") },
                actions = {
                    IconButton(onClick = onWatchListClick) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Watchlist",
                            tint = NiceGray
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = NiceBlue, // your custom color
                    titleContentColor = NiceGray
                )
            )
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            items(viewModel.movies) { movie ->
                SimpleMovieCard(
                    movie = movie,
                    onClick = { onMovieClick(movie.id) }
                )
            }
        }
    }

}