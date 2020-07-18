package com.example.myapplication


// 자바 static처럼 사용


// private constructor <- 다른곳에서는 사용 못하게
class Book private constructor(val id: Int, val name: String) {

//    companion object {
//        fun create() = Book(0, "animal")
//    }

    companion object BookFactory : IdProvider {

        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(0, myBook)

    }

}

interface IdProvider {
    fun getId(): Int
}

fun main() {
//    val book = Book()
//    val book = Book.Companion.create() // companion 생략가능, private 속성이나 메서드를 읽어올 수 있게 하는 역할, 자바의 static역할
    val book = Book.create() // companion 생략가능, private 속성이나 메서드를 읽어올 수 있게 하는 역할, 자바의 static역할

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")


}

