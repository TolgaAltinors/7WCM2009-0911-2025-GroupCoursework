import kotlin.test.Test
import kotlin.test.assertEquals

class SumTest {

    @Test
    fun testPositiveResult() {
        assertEquals<String>("36.0", sum(3))
    }

    @Test
    fun testNegativeResult() {
        assertEquals<String>("Number cannot be less than 1", sum(-3))
    }
}
