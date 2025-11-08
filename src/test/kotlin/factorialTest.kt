import java.math.BigInteger
import kotlin.test.Test
import kotlin.test.assertEquals

class FactorialTest {

    // Tests for stand alone calculateFactorial function
    @Test
    fun testFactorialOfZERO() {
        assertEquals(BigInteger.ONE, calculateFactorial(0))
    }

    @Test
    fun testFactorialOfONE() {
        assertEquals(BigInteger.ONE, calculateFactorial(1))
    }

    @Test
    fun testFactorialOfTEN() {
        assertEquals(BigInteger("3628800"), calculateFactorial(10))
    }

    // Tests for factorial function
    @Test
    fun testNumberGreaterThanZero() {
        assertEquals<String>("Factorial of 2! + 3! + 4! is: 32", factorial(2, 3, 4))
    }

    @Test
    fun testNumberWithZero() {
        assertEquals<String>("Factorial of 0! + 3! + 4! is: 31", factorial(0, 3, 4))
    }

}
