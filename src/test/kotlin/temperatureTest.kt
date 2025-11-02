import kotlin.test.Test
import kotlin.test.assertEquals

class TemperatureTest {
    @Test
    fun testFahrenheitToCelsius() {
        val result = convertTemperature(32.0, 'F', 'C')
        assertEquals("fahrenheit to celsius conversion is 0.0", result)
    }

    @Test
    fun testFahrenheitToKelvin() {
        val result = convertTemperature(32.0, 'F', 'K')
        assertEquals("fahrenheit to kelvin conversion is 273.15", result)
    }

    @Test
    fun testCelsiusToFahrenheit() {
        val result = convertTemperature(100.0, 'C', 'F')
        assertEquals("celsius to fahrenheit conversion is 212.0", result)
    }

    @Test
    fun testCelsiusToKelvin() {
        val result = convertTemperature(100.0, 'C', 'K')
        assertEquals("celsius to kelvin conversion is 373.15", result)
    }

    @Test
    fun testKelvinToFahrenheit() {
        val result = convertTemperature(273.15, 'K', 'F')
        assertEquals("kelvin to fahrenheit conversion is 32.0", result)
    }

    @Test
    fun testKelvinToCelsius() {
        val result = convertTemperature(273.15, 'K', 'C')
        assertEquals("kelvin to celsius conversion is 0.0", result)
    }
}