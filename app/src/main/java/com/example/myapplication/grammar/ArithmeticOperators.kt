package com.example.myapplication.grammar

fun main() {
    var a = 5
    val b = 3.0

    println("a = " + a + " b = " + b)

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("2 + 2 * 3 = ${(2 + 2) * 3}")

    a += 2
    println("a += 2: ${a}")
}