package com.example.myapplication.grammar

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    println(getSum(20, *array, 30, 40))
    println(getSum(10, *array, 30, b = 30))
}

fun getSum(vararg numbers: Int): Int {
    var sum = 0

    for (number in numbers) sum += number

    return sum
}

fun getSum(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a + b

    for (number in numbers) sum += number

    return sum
}