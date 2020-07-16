package com.example.myapplication


//class Human constructor(name : String) {
//class Human constructor(val name: String = "Anonymous") {
open class Human constructor(val name: String = "Anonymous") {
//class Human constructor() { // 주 생성자가 없는 경우

    //    constructor(name:String, age :Int) { // 부 생성자 - 부 생성자는 주생성자의 위임을 받아야한다.
//    }
//         부 생성자 - 부 생성자는 주생성자의 위임을 받아야한다.
    constructor(name: String, age: Int) : this(name) {
        println("name is ${name}, ${age} years old")
    }

    init { // 주 생성자
        println("New human has been born!")
    }

    //    val nmae = "hsj"
    val nmae = name

    fun eatingCake() {
        println("this~~")
    }

    open fun singASong() {
        println("fasf")
    }
}

class Korean : Human() { //상속하겠다, 에러 -> open을 써야한다.
    override fun singASong() {
        super.singASong() // 부모 메서드 호출
        print("라라") // 이것을 호출
        println("name is ${name}") // name을 쓸 수 있는 이유는 Anonymous를 파라미터로 받아옴

    }
}


fun main() {
//        val human = Human()
/*
        val human = Human("minsu")
        val stranger = Human()
    human.eatingCake()
*/

    val mon = Human("ff", 123)

//    println("this human ${human.nmae}")


    val korean = Korean()
    korean.singASong()
}