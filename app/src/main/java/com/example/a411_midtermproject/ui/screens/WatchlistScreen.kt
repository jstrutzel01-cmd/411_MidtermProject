package com.example.a411_midtermproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a411_midtermproject.viewmodel.MovieViewModel
import androidx.compose.ui.Alignment
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun WatchlistScreen(navController: NavController, viewModel: MovieViewModel) {
    val watchlist = viewModel.watchlist

    Scaffold(
        topBar = { TopAppBar(title = { Text("Watchlist") }) }
    ) { padding ->
        if (watchlist.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text("Your watchlist is empty")
            }
        } else {
            LazyColumn(modifier = Modifier.padding(padding)) {
                items(watchlist) { movie ->
                    Text(
                        text = movie.title,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                }
            }
        }
    }
}
