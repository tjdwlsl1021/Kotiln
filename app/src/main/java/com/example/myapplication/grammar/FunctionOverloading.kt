package com.example.myapplication.grammar

fun main() {
    println(getMax(14, 100, 9))

    greet("How are you?", 3)
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int) =
    when {
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }

fun greet(name: String, reps: Int) {
    for (i in 0 until reps) println("Hello, $name!")
}

//fun greet(message: String, reps: Int) {
//    for (i in 0 until reps) println(message)
//}
