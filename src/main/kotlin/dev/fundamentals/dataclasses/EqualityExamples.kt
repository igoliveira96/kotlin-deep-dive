package dev.fundamentals.dataclasses

fun main() {
    val userA = User(
        name = "Igor",
        age = 30
    )

    val userB = User(
        name = "Igor",
        age = 30
    )

    println("Are userA and userB equal? ${userA == userB}") // true
    println("Are userA and userB the same instance? ${userA === userB}") // false
}
