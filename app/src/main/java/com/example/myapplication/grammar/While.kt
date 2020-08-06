package com.example.myapplication.grammar

fun main() {
    var i = 0

    outer@ do {
        println(i)
        i++
        // continue

        var j = 0

        while (j < 5) {
            println("---$j")
            j++
            break@outer
            println("I'm not printed")
        }
        
        println("I'm printed")
    } while (i < 5)

    var number = 8
}