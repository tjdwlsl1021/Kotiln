package com.example.myapplication.grammar

// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수다
// 메소드의 파라미터로 넘겨줄 수 있다. fun maxBY(a :Int)
// return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = [argumentList -> codeBody}

val square1: (Int) -> Int = { number -> number * number }
val square2 = { number: Int -> number * number }

val nameAge = { name: String, age: Int ->
    "name ${name} i ${age}"
}


val test = { a: String, b: Int ->
    ""
}

fun main() {
    println(square1(12))
    println(square2(12))
    println(nameAge("hjs", 2))


    val a = "ab"
    val b = "bcd"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("hsj", 22))

    println(calculateGrade(83))
    println(calculateGrade(862626))


    val lamda = { number: Double -> number == 4.3213 }
    println(invokeLamda(lamda))
    println(invokeLamda({ true })) // 함수선언을 하지 않고 바로 값을 때리는??? 방식을 람다 리터럴방식이라고 한다.

    // 값을 때린다.
    // 커밋을 때린다.
    // 그러고 보니까 때린다는 표현이 많네?>

    // 생략, 똑같은거
    // 마지막 파라미터가 람다식일 때 이렇게 사용한다.
    println(invokeLamda({ it > 3.22 }))
    invokeLamda({ it > 3.22 })
    invokeLamda() { it > 3.22 }
    invokeLamda { it > 3.22 }
}


// 확장함수
// this는 String 오브젝트 그 자체를 가리킨다.
val pizzaIsGreat: String.() -> String = {
    this + "pizz"
}


fun extendString(name: String, age: Int): String {
    // this가 가리키는 것은 확장함수가 부르는 오브젝트, int은 it으로 사용, 파라미터 1개
    val introuduceMysele: String.(Int) -> String = { "I am~ ${this} and ${it}" }
    return name.introuduceMysele(age)

}

// 람다의 Return
val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지방법
// double을 받고, boolean을 리턴하는 람다식으로 받는 파라미터
// invokeLamda함수는  boolean을 리턴한다.
fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.2342)

    //invokeLamda 이 함수는 boolean을 리턴하는데, lamda에 boudle을 넣고, boolean을 리턴 받은 값으로 리턴한다.
}


// pojo 틀 역할을 하는 클래스, 보일러 플레이트, 쓸데 없는 코드, 데이터를 담는 클래스