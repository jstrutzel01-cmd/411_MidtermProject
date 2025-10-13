package com.example.a411_midtermproject.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.a411_midtermproject.data.model.Movie
import com.example.a411_midtermproject.data.repository.MovieRepository

class MovieViewModel : ViewModel() {
    private val _movies = mutableStateListOf<Movie>().apply { addAll(MovieRepository.movies) }
    val movies: List<Movie> get() = _movies

    fun toggleWatchlist(movie: Movie) {
        movie.isInWatchlist = !movie.isInWatchlist
    }

    fun getMovieById(id: Int): Movie? = _movies.find { it.id == id }

    val watchlist: List<Movie>
        get() = _movies.filter { it.isInWatchlist }
}
