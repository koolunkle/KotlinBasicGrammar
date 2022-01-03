package com.inflearn.basicgrammar

fun main() {
    helloWorld()
    println(add(4, 5))
}

//    1. 함수

fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//    2. 변수

fun valAndVar() {

    val a: Int = 10
    var b: Int = 9
    b = 100

    val c = 100
    var d = 100

    var e: String
    var name = "jungi"

}