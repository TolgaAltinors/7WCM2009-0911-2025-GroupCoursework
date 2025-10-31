/**
 * Convert the temp from one unit based on user input to the other two (Celsius, Fahrenheit, Kelvin).
 * @param temp The temperature value to convert. Must be a valid number
 * @param unit The input unit: one of 'C', 'F', or 'K' (case-insensitive).
 * @return temp conversion from given unit to the other two units as part of a string
 */

fun convertTemperature(temp: Double, unit: Char): String{
    if (temp < 0){
        return "Temperature provided failed validation: $temp not greater than Zero";
    }

    //checks if user input is k, c or f
    if (unit != 'f' && unit != 'c' && unit != 'k'){
        return "Unit can only be in celsius, fahrenheit or kelvin"
    }

    val unitToLowerCase = unit.lowercaseChar();

    try {
        //checks if the user input is Fahrenheit and converts to Celsius and kelvin
        if (unitToLowerCase == 'f') {
            val fahrenheitToCelsiusConversion: Double = (temp - 32) / (9.0 / 5.0)
            val fahrenheitToKelvinConversion: Double = (temp + 459.67) * (5.0 / 9.0)
            val celsiusRounded: Double = String.format("%.2f", fahrenheitToCelsiusConversion).toDouble();
            val kelvinRounded: Double = String.format("%.2f", fahrenheitToKelvinConversion).toDouble();
            return "fahrenheit to celsius conversion is $celsiusRounded and fahrenheit to kelvin conversion is $kelvinRounded";

            //checks if the user input is Celsius and converts to Fahrenheit and kelvin
        } else if (unitToLowerCase == 'c'){
            val celsiusToFahrenheitConversion: Double = (temp * 9.0 / 5.0) + 32
            val celsiusToKelvinConversion: Double = temp + 273.15
            val fahrenheitRounded: Double = String.format("%.2f", celsiusToFahrenheitConversion).toDouble();
            val kelvinRounded: Double = String.format("%.2f", celsiusToKelvinConversion).toDouble();
            return "celsius to fahrenheit conversion is $fahrenheitRounded and celsius to kelvin conversion is $kelvinRounded";

            //converts from kelvin to Celsius and Fahrenheit
        } else {
            val kelvinToFahrenheitConversion: Double = (temp * 9.0 / 5.0) - 459.67
            val kelvinToCelsiusConversion: Double = temp - 273.15
            val fahrenheitRounded: Double = String.format("%.2f", kelvinToFahrenheitConversion).toDouble();
            val celsiusRounded: Double = String.format("%.2f", kelvinToCelsiusConversion).toDouble();
            return "kelvin to fahrenheit conversion is $fahrenheitRounded and kelvin to celsius conversion is $celsiusRounded";
        }
    } catch(e: Exception){
        return "Unexpected error: ${e.message}"
    }
}