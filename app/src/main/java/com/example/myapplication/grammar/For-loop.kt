package com.example.myapplication.grammar

fun main() {
    val names = arrayOf("Jim", "John", "Jenny", "jamie")

    for (name in names) println(name)

    for (i in 1..10) println(i)
    for (i in 1 until 10) println(i)
    for (i in 10L downTo 1) println(i)
    for (i in 'a'..'z' step 2) println(i)
}