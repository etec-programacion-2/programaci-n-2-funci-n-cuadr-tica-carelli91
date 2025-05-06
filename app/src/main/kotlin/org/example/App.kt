
package org.example
import kotlin.math.sqrt

val tablaX = mutableListOf<Int>()
val tablaY = mutableListOf<Int>()

fun tablaValores(a: Int, b: Int, c: Int) {
    for (x in -5..5) {
        val fx = a * x * x + b * x + c
        tablaX.add(x)
        tablaY.add(fx)
    }

    println("Tabla de valores:")
    println("X: $tablaX")
    println("Y: $tablaY")
}

fun discriminante(a: Int, b: Int, c: Int): Double {
    return (b * b - 4 * a * c).toDouble()
}

fun raices(a: Int, b: Int, c: Int) {
    val d = b * b - 4 * a * c

    if (d < 0) {
        println("La ecuación no tiene raíces reales.")
    } else {
        val x1 = (-b + sqrt(d.toDouble())) / (2 * a)
        val x2 = (-b - sqrt(d.toDouble())) / (2 * a)
        println("Las raíces son: x1 = $x1, x2 = $x2")
    }
}

fun main() {
    val a = 1
    val b = 2
    val c = 3

    if (a == 0) {
        println("La variable (a) no puede ser cero")
    } else {
        println("La función cuadrática es: ${a}x^2 + ${b}x + ${c}")
        tablaValores(a, b, c)
        val d = discriminante(a, b, c)
        println("El discriminante es: $d")
        raices(a, b, c)
    }
}
