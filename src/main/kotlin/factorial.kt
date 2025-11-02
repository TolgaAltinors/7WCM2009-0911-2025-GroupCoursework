import java.math.BigInteger
/**
 * Compute the factorial of user input
 * @param n1, n2, n3 greater than or equal to 0.
 * @return the factorial of n as part of a string.
 */
fun factorial(n1: Int, n2: Int, n3: Int): String {

    /**
     * Calculate the factorial of user input
     * @param n
     * @return the factorial of n
     */
    fun calculateFactorial(n: Int): BigInteger {
        var tempResult = BigInteger.ONE
        for (i in 2..n) {
            tempResult = tempResult.multiply(BigInteger.valueOf(i.toLong()))
        }
        return tempResult
    }

    if (n1 <= 0 || n2 <= 0 || n3 <= 0 ) {
        return "Numbers provided failed validation. Parameters require to be greater than ZERO."
    }

    // Create list of numbers passed to function
    val numbers = listOf(n1, n2, n3)

    // variable to hold the calculation
    var factorialTotal = BigInteger.ZERO

    try {
        // Loop for creating the sum
        for ((index, j) in numbers.withIndex()) {

            val result = calculateFactorial(j)

            println("Number $index: Factorial of $j is: $result")

            factorialTotal += result
            println("Factorial running total is: $factorialTotal")
            println("***************************************************")
        }
        println("***************************************************")
        return "Factorial of $n1! + $n2! + $n3! is: $factorialTotal"

    }
    catch (e: Exception) {
        // default catch-all
        return "Unexpected error: ${e.message}"
    }
}

