package com.example.a411_midtermproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.a411_midtermproject.navigation.NavGraph
import com.example.a411_midtermproject.ui.theme._411_MidtermProjectTheme
import com.example.a411_midtermproject.viewmodel.MovieViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _411_MidtermProjectTheme {
                val navController = rememberNavController()
                val movieViewModel: MovieViewModel = viewModel()
                NavGraph(navController = navController, movieViewModel = movieViewModel)
            }
        }
    }
}
