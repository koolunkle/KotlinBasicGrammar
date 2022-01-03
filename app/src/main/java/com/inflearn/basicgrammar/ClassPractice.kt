package com.inflearn.basicgrammar

open class Human(val name: String = "Anonymous") {

    constructor(name: String, age: Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so yummy")
    }

    open fun singASong() {
        println("lalala")
    }

}

class Korean : Human() {

    override fun singASong() {
        super.singASong()
        println("라라라")
        println("my name is : ${name}")
    }

}

fun main() {

    val stranger = Human()
    println("this human's name is ${stranger.name}")

    val human = Human("jungi")
    human.eatingCake()

    val mother = Human("sujung", 60)

    val korean = Korean()
    korean.singASong()

}