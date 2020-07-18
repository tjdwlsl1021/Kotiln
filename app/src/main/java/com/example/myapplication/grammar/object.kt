package com.example.myapplication.grammar

// CarFactory 객체는 딱 한번만 생성된다 - Singleton Pattern
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePowe: Int): Car {
        val car = Car(horsePowe)
        cars.add(car)
        return car
    }
}


data class Car(val horsePowe: Int)

fun main() {
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)


    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}