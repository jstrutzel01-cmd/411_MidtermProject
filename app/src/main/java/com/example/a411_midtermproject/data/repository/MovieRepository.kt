package com.example.a411_midtermproject.data.repository

import com.example.a411_midtermproject.R
import com.example.a411_midtermproject.data.model.Movie

object MovieRepository {
    val movies = listOf(
        Movie(1, "Inception", "A thief who steals secrets through dreams.", 8.8, 2010, R.drawable.movie_placeholder),
        Movie(2, "Interstellar", "Explorers travel through a wormhole in space.", 8.6, 2014, R.drawable.movie_placeholder),
        Movie(3, "The Dark Knight", "Batman faces the Joker in Gotham.", 9.0, 2008, R.drawable.movie_placeholder),
        Movie(4, "Chappie", "Police robot becomes sentient.", 7.0, 2015, R.drawable.movie_placeholder),
        Movie(5, "Speed Racer", "Car goes fast.", 9.0, 2008, R.drawable.movie_placeholder),
        Movie(6, "Pokemon 2000", "Pokemon trainer goes on an adventure with Lugia.", 9.0, 2000, R.drawable.movie_placeholder)
    )
}
