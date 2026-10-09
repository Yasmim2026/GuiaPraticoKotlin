
val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) {
        0.0
    } else {
        it
    }
}

fun main() {
    println(calcularGorjeta(null))
    println(calcularGorjeta(-5.0))
    println(calcularGorjeta(10.0))
}