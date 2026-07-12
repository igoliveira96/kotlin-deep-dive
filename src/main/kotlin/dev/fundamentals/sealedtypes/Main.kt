package dev.fundamentals.sealedtypes

fun handleResult(result: Result) {
    when (result) {
        Result.Loading -> {
            println("Loading...")
        }

        is Result.Success -> {
            println("Success: ${result.data}")
        }

        is Result.Error -> {
            println("Error: ${result.message}")
        }
    }
}

fun main() {
    handleResult(Result.Loading)
    handleResult(Result.Success("User loaded"))
    handleResult(Result.Error("Network error"))
}
