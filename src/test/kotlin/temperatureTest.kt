import kotlin.test.Test
import kotlin.test.assertEquals

class TemperatureTest {
    @Test
    fun testTemperatureBelowZero() {
        val result = convertTemperature(-5.0, 'c')
        assertEquals("Temperature provided failed validation: -5.0 not greater than Zero", result)
    }

    @Test
    fun testInvalidUnit() {
        val result = convertTemperature(100.0, 'x')
        assertEquals("Unit can only be in celsius, fahrenheit or kelvin", result)
    }

    @Test
    fun testFahrenheitConversion() {
        val result = convertTemperature(32.0, 'f')
        assertEquals("celsius conversion is 0.0 and kelvin conversion is 273.15", result)
    }

    @Test
    fun testCelsiusConversion() {
        val result = convertTemperature(100.0, 'c')
        assertEquals("fahrenheit conversion is 212.0 and kelvin conversion is 373.15", result)
    }

    @Test
    fun testKelvinConversion() {
        val result = convertTemperature(273.15, 'k')
        assertEquals("fahrenheit conversion is 32.0 and celsius conversion is 0.0", result)
    }
}