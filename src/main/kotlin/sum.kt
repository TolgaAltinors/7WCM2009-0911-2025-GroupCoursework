import kotlin.math.pow


fun sum(number: Int?): String {
    if(number == null) return "Please enter a valid positive number without a decimal value";
    if(number < 1) return "Number cannot be less than 1"
    val numberDataType : String? = number::class.simpleName //using nullable string
    if(numberDataType != null) {
        if(numberDataType != "Int") return "Number must be without a fractional number"
    }

    var sum: Double = 0.0 //declare the sum of the computation as Double
    for(i in 1..number) {//Iterate through from 1 to the natural number entered by the user
        sum +=  i.toDouble().pow(3) //convert the current iteration to double to use the power function
    }
    return sum.toLong().toString() //convert the final computed sum to string based on the return data type of the function
}
