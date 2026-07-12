package dev.fundamentals.dataclasses

val book = Book(
    title = "The Malt Shop Caper",
    author = "Slim Chancery",
    pages = 100
)

fun destructure() {
    val (writtenBy = author, title, pages) = book

    println("Title: $title")
    println("Author: $writtenBy")
    println("Pages: $pages")
}

fun main() {
    destructure()
}