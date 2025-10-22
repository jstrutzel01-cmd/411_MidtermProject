# 411_MidtermProject
Android Jetpack Compose Mid-Term Project - CS 411

# **Movie Viewer App – README**

## **Project Overview**
**Movie Viewer** is an Android app built using **Jetpack Compose** that allows users to:
- Browse collections of movies (with a focus on **Halloween/horror** movies)
- View detailed information about each movie — including **title**, **year**, **rating**, **runtime**, and a short **description**
- Add movies to a **Watchlist**

The app demonstrates key Android development concepts including:
- **State management**
- **Navigation**
- **Custom UI components**

---

## **App Layout**
<img width="386" height="668" alt="Screenshot 2025-10-21 221643" src="https://github.com/user-attachments/assets/c257181c-2fe4-4851-86a3-3ec8eabcf575" />

This app contains three main screens:

- **Home Screen**  
  Displays all movies in a scrollable **lazy column grid** with images, titles, and ratings.  
  Users can:
  - Click a movie’s image to view details  
  - Click the **arrow** in the top-right corner to view their **Watchlist**

- **Details Screen**  
  Shows detailed information about a selected movie and allows adding/removing it from the Watchlist.

- **Watchlist Screen**  
  Displays all movies added to the Watchlist.

The **TopAppBar** includes navigation actions with a **back button** and a **Watchlist icon**.

---

## **File Overview**

### **MainActivity.kt**
- Entry point for the app  
- Sets up the **theme** and **NavGraph**

### **NavGraph.kt**
- Defines all app navigation routes: `home`, `details`, and `watchlist`  
- Connects the screens with the `MovieViewModel`

---

### **Data Layer**

#### `MovieViewModel.kt`
Manages app state including the list of movies and the Watchlist.  
**Functions include:**
- `getMovieById(id: Int)` → Fetches a movie by its ID  
- `toggleWatchlist(movie: Movie)` → Adds/removes a movie from the Watchlist  
- `isInWatchlist(movieId: Int)` → Checks if a movie is in the Watchlist  
- `watchlist` → Returns a list of all movies currently in the Watchlist

---

### **UI Components**
- **`SimpleMovieCard.kt`** → Displays a movie with image, rating, and year in a grid (used in Home and Watchlist screens)  
- **`DetailedMovieCard.kt`** → Shows a detailed view of a movie, including a description and a button to toggle Watchlist status

---

### **Screens**
- **`HomeScreen.kt`** → Displays all movies in a scrollable grid; allows navigation to **Details** and **Watchlist**  
- **`DetailsScreen.kt`** → Shows detailed info for a single movie, includes a **back button** and **Watchlist toggle**  
- **`WatchlistScreen.kt`** → Displays movies currently in the Watchlist and allows navigation to movie details

---

### **Theme**
- **Files:** `Color.kt`, `Theme.kt`, `Type.kt`  
  Define:
  - App colors (dark/light modes)  
  - Typography  
  - Custom palettes for a **Halloween-inspired theme**

Uses:
- `MaterialTheme`
- `TopAppBarDefaults` for consistent theming across the app  

---

## **Functions and Concepts Used**
- **Jetpack Compose UI:** Declarative UI for building screens and components  
- **State Management:** Uses `mutableStateOf` and `mutableStateListOf` for dynamic updates  
- **Navigation:** Uses `NavHost` and `NavController` to switch between screens  
- **ViewModel:** Shared data across screens for consistent UI state  
- **Custom Components:** `SimpleMovieCard` and `DetailedMovieCard` for reusable UI  
- **Dark/Light Theme:** Custom color palette for a Halloween-friendly aesthetic
