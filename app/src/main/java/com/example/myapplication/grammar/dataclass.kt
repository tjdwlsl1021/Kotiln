package com.example.myapplication.grammar

data class Ticket(val companyName: String, val name: String, var date: String, var seatNum: Int)
// 이게 끝이다.
// constructor가 만들어졌다.
// toString(), hashCode(), equals(), copy() 자동으로 만들어졌다. data class를 이용하면

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNum: Int)

// data class와 class의 차이


fun main() {
    val ticketA = Ticket(
        "koreanAir",
        "hjs",
        "2020-20-20",
        62
    )
    val ticketB = TicketNormal(
        "koreanAir",
        "hjs",
        "2020-20-20",
        62
    )

    println(ticketA) // 결과  : Ticket(companyName=koreanAir, name=hjs, date=2020-20-20, seatNum=62)
    println(ticketB) // 결과 : com.example.myapplication.grammar.TicketNormal@60e53b93 <- 메모리 주소


}

// 이거를 자바로 만들려면 constructor만들고, getter, setter만들고~~