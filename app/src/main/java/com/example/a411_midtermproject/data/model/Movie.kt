package com.example.a411_midtermproject.data.model

data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val rating: Double,
    val year: Int,
    val imageRes: Int,
    val runtime: Int,
    var isInWatchlist: Boolean = false,
)
