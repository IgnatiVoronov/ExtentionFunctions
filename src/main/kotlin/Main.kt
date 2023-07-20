fun main(args: Array<String>) {
    val n = 5
    println(Int.factorial(n))

    val d = 3.5
    println(Double.toNegativeNumber(d))

    val s = "123456789012"
    println(s.twelveDigitsToTelephoneNumber())
}


fun Int.Companion.factorial(num: Int): Long? {
    if (num <= 0) {
        return null
    }
    return if (num != 1) {
        num * factorial(num - 1)!!
    } else 1
}

private fun Double.Companion.toNegativeNumber(double: Double): Double? {
    return if (double > 0) {
        double.unaryMinus()
    } else null
}

fun String.twelveDigitsToTelephoneNumber(): String? {
    if (!this.matches(Regex("\\d{12}"))) {
        return null
    }

    return "+" + this.substring(0..2) +
            " (" + this.substring(3..4) +
            ") " + this.substring(5..7) +
            "-" + this.substring(8..9) +
            "-" + this.substring(10..11)
}