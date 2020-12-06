import kotlin.math.absoluteValue

fun Int.r(): RationalNumber = RationalNumber(absoluteValue, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second)

data class RationalNumber(val numerator: Int, val denominator: Int)
