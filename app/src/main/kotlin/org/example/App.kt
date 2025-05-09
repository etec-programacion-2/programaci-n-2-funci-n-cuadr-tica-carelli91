
package org.example
//se importa la librería kotlin.math para usar la función sqrt
import kotlin.math.sqrt

//se definen las variables tablaX y tablaY como listas mutables de enteros
val tablaX = mutableListOf<Int>()
val tablaY = mutableListOf<Int>()

//////////////////////////// EJERCICIO 2 ////////////////////////////
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

//////////////////////////// EJERCICIO 3 ////////////////////////////
fun discriminante(a: Int, b: Int, c: Int): Double {
    //las potencias se calculan directamente haciendo la multiplicación
    return (b * b - 4 * a * c).toDouble()
}

fun raices(a: Int, b: Int, c: Int) {
    val d = b * b - 4 * a * c

    if (d < 0) {
        //si el discriminante es menor que 0, no hay raíces reales
        println("La ecuación no tiene raíces reales.")
    } else {
        //sqrt sirve para calcular la raíz cuadrada
        //d.toDouble() convierte el valor de d a un número decimal
        val x1 = (-b + sqrt(d.toDouble())) / (2 * a)
        val x2 = (-b - sqrt(d.toDouble())) / (2 * a)
        println("Las raíces son: x1 = $x1, x2 = $x2")
    }
}




//funcion principal para ejecutar todo
fun main() {
    val a = 1
    val b = -2
    val c = 1

    if (a == 0) {
        println("La variable (a) no puede ser cero")
    } else {
        //EJERCICIO 1
        println("EJERCICIO 1")
        println("La función cuadrática es: ${a}x^2 + ${b}x + ${c}")

        //EJERICICIO 2
        println("EJERCICIO 2")
        tablaValores(a, b, c)

        //EJERCICIO 3
        println("EJERCICIO 3")
        val d = discriminante(a, b, c)
        println("El discriminante es: $d")
        raices(a, b, c)
    }
}
