
package org.example

val tablaX = mutableListOf<Int>()
val tablaY = mutableListOf<Int>()

fun tablaValores (a: Int, b: Int, c: Int) {
    for (x in -5..5) {
        val fx = a * x * x + b * x + c
        tablaX.add(x)
        tablaY.add(fx)
    }

    println("Tabla de valores:")
    println("X: ${tablaX}")
    println("Y: ${tablaY}")
}

fun main() {
    val a = 1
    val b = 2
    val c = 3

    if (a == 0) {
        println("La variable (a) no pueden ser cero")
    }
    else {
        println("La funcion cuadratica es: ${a}x^2 + ${b}x + ${c}") 

        tablaValores(a, b, c)  
    }

}
