package dev.fundamentals.sealedtypes

sealed class PaymentState(
    open val message: String
) {
    data object Processing : PaymentState(
        message = "Payment is processing"
    )

    data class PaymentApproved(
        val transactionId: String
    ) : PaymentState(
        message = "Payment approved"
    )

    data class Declined(
        val reason: String
    ) : PaymentState(
        message = reason
    )
}
