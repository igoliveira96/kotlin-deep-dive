package dev.fundamentals.dataclasses

data class Movie(
    val title: String,
    val director: String,
    val year: Int
)

fun main() {

    val movie = Movie(
        title = "Interstellar",
        director = "Christopher Nolan",
        year = 2014
    )

    val (title, director, year) = movie

    println("Title: $title")
    println("Director: $director")
    println("Year: $year")
}
