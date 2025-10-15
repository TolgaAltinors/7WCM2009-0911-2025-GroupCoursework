fun main() {

    println("Please select desired operation:\n1 - Perform sum of a given number\n2 - Perform temperature conversion\n3 - Perform factorial calculation\n4 - Exit")

    while (true) {
        print("> ")
        val input = readln().trim().lowercase()

        when (input) {
            "1" -> {
                print("Enter integer to calculate the sum: ")

            }

            "2" -> {
                print("Select unit to convert from: ")


                print("Select unit to convert to: ")

            }

            "3" -> {
                print("Enter integer for factorial calculation: ")

            }

            "4" -> {
                println("Exiting application!")
                break
            }

            else -> println("Command not recognised. Please try again.")
        }
    }
}

