package com.example.myapplication.grammar

fun main() {
    val user1 = User("      hans        ", 30)
    val user2 = User("      Elfriede        ", 60)
    val user3 = User(age = 60)
    val user4 = User("      ", age = 20)
}

class User(name: String = "No Name", var age: Int) {
    init {
        println("New user created. Age: $age,")
    }

    val name: String

    init {
        if (name.isBlank()) {
            this.name = "No Name"
        } else {
            this.name = name.trim()
        }
        println(" Name: ${this.name}")
    }
}