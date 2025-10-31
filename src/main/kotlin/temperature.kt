fun convertTemperature(temp: Double, unit: Char): String{
    if (temp < 0){
        return "Temperature provided failed validation: $temp not greater than Zero";
    }

    //checks if user input is k, c or f
    if (unit != 'f' && unit != 'c' && unit != 'k'){
        return "Unit can only be in celcius, farenheit or kelvin"
    }

    val unitToLowerCase = unit.lowercaseChar();

    try {
        //checks if the user input is farenheit and converts to celcius and kelvin
        if (unitToLowerCase.equals('f')) {
            val farenheitToCelciusConversion: Double = (temp - 32) / (9.0 / 5.0)
            val farenheitToKelvinConversion: Double = (temp + 459.67) * (5.0 / 9.0)
            val celciusRounded: Double = String.format("%.2f", farenheitToCelciusConversion).toDouble();
            val kelvinRounded: Double = String.format("%.2f", farenheitToKelvinConversion).toDouble();
            return "celsius conversion is $celciusRounded and kelvin conversion is $kelvinRounded";

            //checks if the user input is celcius and converts to farenheit and kelvin
        } else if (unitToLowerCase.equals('c')){
            val celciusToFarenheitConversion: Double = (temp * 9.0 / 5.0) + 32
            val celciusToKelvinConversion: Double = temp + 273.15
            val farenheitRounded: Double = String.format("%.2f", celciusToFarenheitConversion).toDouble();
            val kelvinRounded: Double = String.format("%.2f", celciusToKelvinConversion).toDouble();
            return "farenheit conversion is $farenheitRounded and kelvin conversion is $kelvinRounded";

            //converts from kelvin to celcius and farenheit
        } else {
            val kelvinToFarenheitConversion: Double = (temp * 9.0 / 5.0) - 459.67
            val kelvinToCelciusConversion: Double = temp - 273.15
            val farenheitRounded: Double = String.format("%.2f", kelvinToFarenheitConversion).toDouble();
            val celciusRounded: Double = String.format("%.2f", kelvinToCelciusConversion).toDouble();
            return "farenheit conversion is $farenheitRounded and celcius conversion is $celciusRounded";
        }
    } catch(e: Exception){
        return "Unexpected error: ${e.message}"
    }
}