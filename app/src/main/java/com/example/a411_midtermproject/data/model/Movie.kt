package com.example.a411_midtermproject.data.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val rating: Double,
    val year: Int,
    val imageRes: Int,
    val runtime: Int,
) {
    var isInWatchlist by mutableStateOf(false)
}
