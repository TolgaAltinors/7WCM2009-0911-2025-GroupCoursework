import kotlin.test.Test
import kotlin.test.assertEquals

class FactorialTest {

    @Test
    fun testNumberGreaterThanZero() {
        assertEquals<String>("Factorial of 2! + 3! + 4! is: 32", factorial(2, 3, 4))
    }

    @Test
    fun testNumberLessThanOrEqualToZero() {
        assertEquals<String>("Numbers provided failed validation. Parameters require to be greater than ZERO.", factorial(0, 0, 0))
    }

}
