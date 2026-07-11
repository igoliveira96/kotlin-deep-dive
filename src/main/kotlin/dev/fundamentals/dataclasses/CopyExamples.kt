package dev.fundamentals.dataclasses

fun main() {
    val user = User(
        name = "Igor",
        age = 30
    )

    val updatedUser = user.copy(
        name = "Igor Goulart"
    )

    println(updatedUser)
}
