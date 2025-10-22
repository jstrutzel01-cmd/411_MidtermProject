# 411_MidtermProject
Android Jetpack Compose Mid-Term Project - CS 411
Movie View App - README
Project Overview 
Movie Viewer is an android app built using Jetpack Compose that allows users to. 
Browse collections of movies (with a focus of Halloween/horror movies)
View detailed information about each movie, title, year, rating, runtime and short description. 
Add movies to a watchlist.
The app demonstrates key Android development concepts including state management, navigation and custom UI components.

App Layout 
This app contains three main screens 
Home Screen - this displays all movies in a scrollable lazy column grid with images, titles and rating. Here the user can choose to click on a movie’s image to see details, or click the arrow in the top corner to see their watchlist.
Details Screen - Shows detailed information about the selected movie and allows adding/removing it from the watchlist 
Watchlist Screen - Shows all movies added to the watchlist.
The topbar includes navigation actions with a back button and watch list arrow

<img width="386" height="668" alt="Screenshot 2025-10-21 221643" src="https://github.com/user-attachments/assets/c257181c-2fe4-4851-86a3-3ec8eabcf575" />

File Overview 
MainActivity.kt
Entry point for the app 
Sets up theme and NavGraph 
NavGraph.kt
Defines all app navigation routes: home, details and watchlist
Connects the screen with the MovieViewModel
Data Layer 
MovieViewModel.kt -Manages app state including the list of movies and the watchlist 
Functions:
getMovieById(id: Int): fetches a movie by its ID.
toggleWatchlist(movie: Movie): adds/removes a movie from the Watchlist.
isInWatchlist(movieId: Int): checks if a movie is in the Watchlist.
watchlist: returns a list of all movies currently in the Watchlist.
UI Components 
SimpleMovieCard.kt: Displays a movie with image, rating, and year in a grid. Used in HomeScreen and WatchlistScreen.
DetailedMovieCard.kt: Shows a detailed view of a movie including description and a button to toggle Watchlist status.
Screens 
HomeScreen.kt: Displays all movies in a scrollable grid, allows navigation to details and watchlist
DetailedScreen.kt: Shows detailed info for a single movie. Includes a back button and a Watchlist toggle.
watchlistScreen.kt: Shows movies currently in the Watchlist; allows navigation to movie details.
Theme
Color.kt, Theme.kt, Type.kt all define the app colors, dark and light themes and typography 
MateriaTheme and TopAppBarDefault is used for consistent theming across the app

Functions and Concepts Used 
Jetpack Compose UI: declarative UI for screens and components.
State management: via mutableStateOf and mutableStateListOf for dynamic updates.
Navigation: using NavHost and NavController to switch between screens.
ViewModel: shared data across screens, keeping UI state consistent.
Custom components: SimpleMovieCard and DetailedMovieCard for reusable UI.
Dark/Light Theme: custom color palette for a Halloween-friendly theme.


