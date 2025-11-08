import kotlin.test.Test
import kotlin.test.assertEquals

class SumTest {

    @Test
    fun testPositiveResult() {
        assertEquals<Long>(36, sumCubes(3))
    }

    @Test
    fun testNegativeResult() {
        assertEquals<Long>(0, sumCubes(-3))
    }
}
