/**
 * Convert the temp from one unit (Celsius, Fahrenheit or Kelvin), based on user input (unitFrom) to another based on user input (unitTo).
 * @param temp The temperature value to convert. Must be a valid number
 * @param unitFrom The input unit to convert from: one of 'C', 'F', or 'K' (case-insensitive).
 * @param unitTo The input unit to convert to: one of 'C', 'F', or 'K' (case-insensitive).
 * @return temp conversion from given unit to the other two units as part of a string
 */

fun convertTemperature(temp: Double, unitFrom: Char?, unitTo: Char?): String{
    try {
        //checks if the unitFrom is Fahrenheit and converts to Celsius or Kelvin based on the unitTo
        if (unitFrom == 'F') {
            if (unitTo == 'C') {
                val fahrenheitToCelsiusConversion: Double = (temp - 32) / (9.0 / 5.0)
                val celsiusRounded: Double = String.format("%.2f", fahrenheitToCelsiusConversion).toDouble();
                return "fahrenheit to celsius conversion is $celsiusRounded"
            } else {
                val fahrenheitToKelvinConversion: Double = (temp + 459.67) * (5.0 / 9.0)
                val kelvinRounded: Double = String.format("%.2f", fahrenheitToKelvinConversion).toDouble();
                return "fahrenheit to kelvin conversion is $kelvinRounded";
            }

            //checks if the unitFrom is Celsius and converts to Fahrenheit or kelvin based on the unitTo
        } else if (unitFrom == 'C'){
            if (unitTo == 'F'){
                val celsiusToFahrenheitConversion: Double = (temp * 9.0 / 5.0) + 32
                val fahrenheitRounded: Double = String.format("%.2f", celsiusToFahrenheitConversion).toDouble();
                return "celsius to fahrenheit conversion is $fahrenheitRounded"
            } else {
                val celsiusToKelvinConversion: Double = temp + 273.15
                val kelvinRounded: Double = String.format("%.2f", celsiusToKelvinConversion).toDouble();
                return "celsius to kelvin conversion is $kelvinRounded"
            }

            //converts from Kelvin to Celsius or Fahrenheit based on the unitTo
        } else {
            if (unitTo == 'F') {
                val kelvinToFahrenheitConversion: Double = (temp * 9.0 / 5.0) - 459.67
                val fahrenheitRounded: Double = String.format("%.2f", kelvinToFahrenheitConversion).toDouble();
                return "kelvin to fahrenheit conversion is $fahrenheitRounded"
            } else {
                val kelvinToCelsiusConversion: Double = temp - 273.15
                val celsiusRounded: Double = String.format("%.2f", kelvinToCelsiusConversion).toDouble();
                return "kelvin to celsius conversion is $celsiusRounded"
            }
        }
    } catch(e: Exception){
        return "Unexpected error: ${e.message}"
    }
}