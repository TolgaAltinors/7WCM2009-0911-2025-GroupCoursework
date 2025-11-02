/**
 * Interactive Kotlin command-line application providing three operations:
 *
 * 1. Sum of a natural number:
 *    - Prompts the user for a positive integer value.
 *    - Calls sum(n) to calculate the series 1³ + 2³ + ... + n³.
 *    - Ensures that only valid natural numbers are accepted.
 *
 * 2. Temperature conversion:
 *    - Prompts the user for a numeric temperature value.
 *    - Accepts a unit to convert from and a target unit to convert to (C, F, or K).
 *    - Validates Kelvin input to ensure it is never below absolute zero.
 *    - Calls convertTemperature(value, fromUnit, toUnit) and displays the result.
 *
 * 3. Factorial calculation:
 *    - Requests three separate non-negative integers.
 *    - Validates each input before proceeding.
 *    - Calls factorial(n1, n2, n3) to compute the sum of the three factorials.
 *
 * Input is continuously validated to prevent runtime errors. The menu repeats
 * until the user chooses to exit the application.
 */

fun main() {



    // Main program loop - keeps running until user chooses to exit
    while (true) {
        // Display the main operation menu
        println("Please select desired operation:\n1 - Perform sum of a given number\n2 - Perform temperature conversion\n3 - Perform factorial calculation\n4 - Exit")
        print("> ")
        val input = readln().trim().lowercase()

        when (input) {
            "1" -> {
                // Loop for validating sum number input
                while(true) {
                    print("Enter integer to calculate the sum: ")
                    val number = readln().toIntOrNull()
                    if(number != null && number > 0){
                        // Call sum function and print result
                        println(sum(number))
                        break
                    }else{
                        println("Invalid input. Please enter a number greater than zero.")
                    }
                }

            }

            "2" -> {
                // List of allowed temperature units
                val validUnits = listOf('C', 'F', 'K')
                tempConvertLoop@ while(true){
                    print("Enter a temperature value: ")
                    val number = readln().toDoubleOrNull()

                    // Validate temperature input
                    if(number != null){
                        while(true){
                            print("Select unit to convert from (C,F,K): ")
                            val unitFrom = readln().trim().uppercase().firstOrNull();

                            // Validate unit
                            if(unitFrom in validUnits){
                                // Kelvin cannot be negative
                                if(unitFrom == 'K' && number < 0) {
                                    println("Kelvin can not be negative.")
                                    continue
                                }
                                while (true) {
                                    print("Select unit to convert to: ")
                                    val unitTo = readln().trim().uppercase().firstOrNull();

                                    // Validate conversion unit
                                    if (unitTo in validUnits) {
                                        if (unitTo != unitFrom) {
                                            // Perform conversion
                                            println(convertTemperature(number, unitFrom, unitTo))
                                            break@tempConvertLoop
                                        } else {
                                            println("Units must be different.")
                                        }
                                    } else {
                                        println("Invalid unit. Please enter C, F or K.")
                                    }
                                }

                            }else{
                                println("Invalid unit. Please enter C, F or K.")
                            }
                        }
                    }else{
                        println("Invalid number. Please enter a numeric value.")
                    }
                }
            }

            "3" -> {
                // Factorial input loop with validation on all three numbers
                factorialLoop@ while(true) {
                    print("Enter 1st integer for factorial calculation: ")
                    val number = readln().trim().toIntOrNull()

                    if (number != null && number >= 0) {
                        while (true) {
                            print("2nd number: ")
                            val number2 = readln().trim().toIntOrNull()

                            if (number2 != null && number2 >= 0) {
                                while (true) {
                                    print("3rd number: ")
                                    val number3 = readln().trim().toIntOrNull()

                                    if (number3 != null && number3 >= 0) {
                                        // Call factorial function with three values
                                        println(factorial(number, number2, number3))
                                        break@factorialLoop
                                    } else {
                                        println("Invalid 3rd number input. Please enter a non-negative integer.")
                                    }
                                }
                            } else {
                                println("Invalid 2nd number input. Please enter a non-negative integer.")
                            }
                        }
                    } else {
                        println("Invalid 1st number input. Please enter a non-negative integer.")
                    }
                }
            }

            "4" -> {
                // Exit
                println("Exiting application!")
                break
            }

            // Handle invalid operation input
            else -> println("Command not recognised. Please try again.")
        }
    }
}
