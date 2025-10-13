package com.example.a411_midtermproject.data.repository

import com.example.a411_midtermproject.R
import com.example.a411_midtermproject.data.model.Movie

object MovieRepository {
    val movies = listOf(
        Movie(1, "Inception", "A thief who steals secrets through dreams.", 8.8, R.drawable.ic_launcher_foreground),
        Movie(2, "Interstellar", "Explorers travel through a wormhole in space.", 8.6, R.drawable.ic_launcher_foreground),
        Movie(3, "The Dark Knight", "Batman faces the Joker in Gotham.", 9.0, R.drawable.ic_launcher_foreground)
    )
}
