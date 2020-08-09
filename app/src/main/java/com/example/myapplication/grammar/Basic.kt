package com.example.myapplication.grammar

fun main() {
    val exampleString = "\"Florian\nWalther\""
    val exampleRawString = """ "Florian Walther" """

    print(exampleRawString)

    val exampleNumber = 2_000_000.12
    val exampleLong: Long = exampleNumber.toLong()

    val exampleChar = '?'
    val exampleInt: Int = exampleChar.toInt()

    val exampleBoolean = false
}