package bellica.spiritualis.cookbook.core

fun String.convertToDouble(): Double {
    return if (this.isEmpty()) 0.0
    else this.replace(",", ".").toDouble()
}