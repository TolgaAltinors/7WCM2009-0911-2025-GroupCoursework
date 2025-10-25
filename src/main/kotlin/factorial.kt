import java.math.BigInteger
/**
 * Compute the factorial of user input
 * @param n greater than or equal to 0.
 * @return the factorial of n as part of a string.
 */
fun factorial(n: Int): String {

    // variable to hold the calculation unless there is a overflow error
    var factorial_result: Long = 1L

    if (n <= 0) {
        return "Number provided failed validation: $n not greater than Zero"
    }
    try {
        // Loop for creating the sum
        // Math.multiplyExact provides an overflow exception if Long.MAX_VALUE is exceeded
        for (i in 2..n) {
            factorial_result =
                Math.multiplyExact(factorial_result, i.toLong())  // to detect the overflow and raises error
        }
        return "Factorial of $n is: $factorial_result"
    } catch (e: ArithmeticException) {
        // We encountered an overflow exception. We will use BigInteger instead
        var factorial_result_big = BigInteger.ONE
        // Loop for creating the sum
        for (i in 2..n) {
            factorial_result_big = factorial_result_big.multiply(BigInteger.valueOf(i.toLong()))
        }
        return "Factorial of $n is: $factorial_result_big"
    } catch (e: Exception) {
        // default catch-all
        return "Unexpected error: ${e.message}"
    }
}
