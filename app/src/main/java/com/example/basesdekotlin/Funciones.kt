package com.example.basesdekotlin

fun main ()
{
    println(Hola())
    println(Suma(2, 3))
    println(Resta(2, 3))
    println("Resultado de la division ${Division(3,2)}")
}


private fun Hola(): String  //: Unit - El tipo de dato unit indica que la funcion es un procedimiento
{
    println("Hola Kotlin")
    var saludo: String = "Hola Kotlin"
    return saludo
}

private fun Suma(a: Int, b: Int): Int
{
    var suma = a + b
    return suma
}

fun Resta(i: Int, i1: Int): Any? {
    var resta = i - i1
    return resta
}

fun Multiplicacion(a: Int, b: Int): Int
{
    return a * b
}

fun Division(a: Int, b: Int): Int
{
    return a / b
}
