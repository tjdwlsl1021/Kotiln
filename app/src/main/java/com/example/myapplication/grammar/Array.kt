package com.example.myapplication.grammar

fun main() {
    val names = arrayOf("Jin", "John", "Jenny", "Jamie")

    names[0] = "Jeremy"

    println(names[0].length)

    println("Number of elements : ${names.size}")
    println("First element: ${names[0]}")
    println("Last element: ${names[2]}")
}