import kotlin.math.pow

/**
 * Function to calculate the sum of cubes of a natural number.
 * @param number is a natural number greater than zero i.e 1,2,3,4...n.
 * @param sum returns the sum of the cubes. Returns string due to validation handled within the function.
 */

fun sum(number: Int): String {
    try {
        if(number < 1) return "Number cannot be less than 1"
        var sumOfNaturalNumbers: Double = 0.0 //declare the sum of the computation as Double
        for(i in 1..number) {//Iterate through from 1 to the natural number (inclusive) entered by the user
            sumOfNaturalNumbers +=  i.toDouble().pow(3) //convert the current iteration to double to use the power function
        }
        return sumOfNaturalNumbers.toLong().toString() //convert the final computed sum to string based on the return data type of the function
    }
    catch(e: Exception){
        return "Unexpected error: ${e.message}"
    }
}
