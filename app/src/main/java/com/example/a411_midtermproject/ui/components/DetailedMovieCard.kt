package com.example.a411_midtermproject.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a411_midtermproject.R
import com.example.a411_midtermproject.data.model.Movie
import com.example.a411_midtermproject.ui.theme._411_MidtermProjectTheme


@Composable
fun DetailedMovieCard (
    movie: Movie,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp)

    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,


        )
             {
                Image(
                    painter = painterResource(id = movie.imageRes),
                    contentDescription = movie.title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .weight(0.4f)
                )



            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.6f )
                    .padding(12.dp)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleLarge
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(text = movie.year.toString())
                    Text(text = "${movie.runtime.toString()} min")
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating",
                            tint = Color.Yellow
                        )
                        Text(
                            text = movie.rating.toString(),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                Text(text = movie.description, style = MaterialTheme.typography.bodyMedium)

                Spacer(modifier = Modifier.weight(1f))

                Button(onClick = {},
                    modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Add to watchlist")
                }


            }
        }


    }

}


@Preview(showBackground = true)
@Composable
fun DetailedMovieCardPreview() {
    _411_MidtermProjectTheme {
        val sampleMovie = Movie(
                id = 1,
        title = "Inception",
        description = "A thief who steals corporate secrets through dreams.",
        rating = 8.8,
        year = 2010,
        runtime = 169,
        imageRes = R.drawable.inception
        )

        DetailedMovieCard(
            movie = sampleMovie
        )

    }
}

