fun main() {

    println("Please select desired operation:\n1 - Perform sum of a given number\n2 - Perform temperature conversion\n3 - Perform factorial calculation\n4 - Exit")

    while (true) {
        print("> ")
        val input = readln().trim().lowercase()

        when (input) {
            "1" -> {
                while(true) {
                    print("Enter integer to calculate the sum: ")
                    val number = readln().toIntOrNull()
                    if(number != null && number > 0){
                        println(sum(number))
                        break
                    }else{
                        println("Invalid input. Please enter a number greater than zero.")
                    }
                }

            }

            "2" -> {
                val validUnits = listOf("C", "F", "K")
                tempConvertLoop@ while(true){
                    print("Enter a temperature value: ")
                    val number = readln().toDoubleOrNull()
                    if(number != null){
                        while(true){
                            print("Select unit to convert from (C,F,K): ")
                            val unitFrom = readln().trim().uppercase()
                            if(unitFrom in validUnits){
                                if(unitFrom == "K" && number < 0) {
                                    println("Kelvin can not be negative.")
                                    continue
                                }
                                    while (true) {
                                        print("Select unit to convert to: ")
                                        val unitTo = readln().trim().uppercase()
                                        if (unitTo in validUnits) {
                                            if (unitTo != unitFrom) {
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
               factorialLoop@ while(true) {
                    print("Enter 1st integer for factorial calculation: ")
                    val number = readln().trim().toIntOrNull()
                    if (number != null && number >= 0) {
                        while(true) {
                            print("2nd number: ")
                            val number2 = readln().trim().toIntOrNull()
                            if(number2 != null && number2 >= 0){
                                while(true) {
                                    print("3rd number: ")
                                    val number3 = readln().trim().toIntOrNull()
                                    if (number3 != null && number3 >= 0) {
                                        println(factorial(number, number2, number3))
                                        break@factorialLoop
                                    } else {
                                        println("Invalid 3rd number input. Please enter a non-negative integer.")
                                    }
                                }
                            }else{
                                println("Invalid 2nd number input. Please enter a non-negative integer.")
                            }
                        }
                    } else {
                        println("Invalid 1st number input. Please enter a non-negative integer.")

                    }
                }

                // **************************************
                // VALIDATION TO BE ADDED
                // 1 - INPUT TO BE A NUMBER
                // 2 - INPUT TO BE GREATER THAN 0
                // **************************************
                //val l : Int = readLine()!!.toInt()
                //println(factorial(l))

            }

            "4" -> {
                println("Exiting application!")
                break
            }

            else -> println("Command not recognised. Please try again.")
        }
    }
}

