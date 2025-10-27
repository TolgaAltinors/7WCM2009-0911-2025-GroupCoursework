import kotlin.test.Test
import kotlin.test.assertEquals

class FactorialTest {

    @Test
    fun testNumberGreaterThanZero() {
        assertEquals<String>("Factorial of 5 is: 120", factorial(5))
    }

    @Test
    fun testNumberEqualToZero() {
        assertEquals<String>("Number provided failed validation: 0 not greater than Zero", factorial(0))
    }

    @Test
    fun testNumberLessThanZero() {
        assertEquals<String>("Number provided failed validation: -1 not greater than Zero", factorial(-1))
    }

}
