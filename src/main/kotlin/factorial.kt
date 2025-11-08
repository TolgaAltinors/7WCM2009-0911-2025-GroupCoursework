import java.math.BigInteger

/**
 * Calculate the factorial of passed integer
 * @param n
 * @return the factorial of n as Long data type
 */
fun calculateFactorial(n: Int): BigInteger {
    var tempResult = BigInteger.ONE
    for (i in 2..n) {
        tempResult = tempResult.multiply(BigInteger.valueOf(i.toLong()))
    }
    return tempResult
}

/**
 * Compute the factorial of user input
 * @param n1, n2, n3 greater than or equal to 0.
 * @return the factorial of n as part of a string.
 */
fun factorial(n1: Int, n2: Int, n3: Int): String {

    // Create list of numbers passed to function
    val numbers = listOf(n1, n2, n3)

    // variable to hold the calculation
    var factorialTotal = BigInteger.ZERO

    try {
        // Loop for creating the sum
        for ((index, j) in numbers.withIndex()) {

            val result = calculateFactorial(j)

            println("Number ${index + 1}: Factorial of $j is: $result")

            factorialTotal += result
            println("Factorial running total is: $factorialTotal")
            println("***************************************************")
        }
        println("***************************************************")
        println("")
        return "Factorial of $n1! + $n2! + $n3! is: $factorialTotal"

    }
    catch (e: Exception) {
        // default catch-all
        return "Unexpected error: ${e.message}"
    }
}

