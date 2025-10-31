import kotlin.math.pow
fun sum(number: Int): Double {
    var sum: Double = 0.0
    for(i in 1..number) {
        sum +=  i.toDouble().pow(3)
    }
    return sum
}
