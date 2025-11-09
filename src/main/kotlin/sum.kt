import kotlin.math.pow

/**
 * Function to calculate the sum of cubes of a natural number.
 * @param number is a natural number greater than zero i.e 1,2,3,4...n.
 * @param sum returns the sum of the cubes. Returns a Long value.
 */

fun sumCubes(number: Int): Long {
    try {
        var sumCubesOfNaturalNumbers: Double = 0.0 //declare and initialize the sumCubesOfNaturalNumbers of the computation as Double
        for(i in 1..number) {//Iterate through from 1 to the natural number (inclusive) entered by the user
            sumCubesOfNaturalNumbers +=  i.toDouble().pow(3) //convert the current iteration to double to use the power function and add to the previous sumCubesOfNaturalNumbers
        }
        return sumCubesOfNaturalNumbers.toLong() // returns the calculated sum of cubes
    }
    catch(e: Exception){
        println("Unexpected error: ${e.message}")
        return 0 //safely return zero
    }
}
