package com.example.myapplication.grammar

fun main() {
    val time = 14
    val isSunday = true


    val greeting = when {
        isSunday -> "I'm gonna stay in bed all day!"
        time < 5 -> "Why up so early?"
        in 0..11 -> {
            "Good morning!"
        }
        12 -> {
            "Time for lunch!"
        }
        13, 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }
        else -> {
            "Good day!"
        }
    }


//    val greeting = when (time) {
//        in 0..5 -> "Why up so early?"
//        in 0..11 -> {
//            "Good morning!"
//        }
//        12 -> {
//            "Time for lunch!"
//        }
//        13, 14 -> {
//            println("Yawn...")
//            "Time for a nap!"
//        }
//        else -> {
//            "Good day!"
//        }
//    }

    println(greeting)


    /*when (time) {
        in 0..5 -> println("Why up so early?")
        in 0..11 -> {
            println("Good morning!")
        }
        12 -> {
            println("Time for lunch!")
        }
        else -> {
            println("Good day!")
        }
    }*/


    /*if(time in 0..11) {
        println("Good morning!")
    } else if(time == 12) {
        println("Time for lunch!")
    } else {
        println("Good day!")
    }
*/

//   val greeting = if(time in 0..11) {
//        "Good morning!"
//    } else if(time == 12) {
//        "Time for lunch!"
//    } else {
//        "Good day!"
//    }
//
//
////    println(greeting)
//    println("Good ${if(time < 12) "morning" else "day"}!")
}