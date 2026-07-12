package dev.fundamentals.sealedtypes

sealed interface Result {
    data object Loading : Result

    data class Success(
        val data: String
    ) : Result

    data class Error(
        val message: String
    ) : Result
}
