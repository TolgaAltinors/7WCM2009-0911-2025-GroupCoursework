fun main() {

    println("Please select desired operation:\n1 - Perform sum of a given number\n2 - Perform temperature conversion\n3 - Perform factorial calculation\n4 - Exit")

    while (true) {
        print("> ")
        val input = readln().trim().lowercase()

        when (input) {
            "1" -> {
                print("Enter integer to calculate the sum: ")
                val number : Int? = readln().toIntOrNull()
                if (number == null) {
                    println("Invalid input. Please enter a valid integer.")
                    continue
                }
                //val totalValue: Double = sum(number)
                val totalValue: String = sum(number)
                if(totalValue.toIntOrNull() == null)
                    println(totalValue)
                else
                    println("The sum is $totalValue")

            }

            "2" -> {
                print("Enter unit to convert from use f for fahrenheit, c for celsius and k for kelvin: ")
                val unit: Char? = readln().lowercase().firstOrNull();
                if (unit == null) {
                    println("Unit cannot be empty. Please try again.")
                }

                print("Enter the value of temperature you want to convert, use decimal point: ")
                val value: Double? = readln().toDoubleOrNull();
                if (value == null) {
                    println("Value cannot be empty. Please try again.")
                }

                if (unit != null && value != null ){
                    println(convertTemperature(value, unit))
                }

            }

            "3" -> {
                print("Enter integer for factorial calculation: ")

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

